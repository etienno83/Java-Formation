package fr.adaming.test.second.degre;

import fr.adaming.model.second.degre.RacineSecondDegre;

public class ClassTest {

	public static void main(String[] args) {

		double a = 1;
		double b = -3;
		double c = 1;

		RacineSecondDegre e = new RacineSecondDegre();

		Double[] racines = e.calculRacine(a, b, c);

		if (racines[0] == null && racines[1] == null) {
			System.out.println("L'equation n'a pas de racines dans R");
		} else if (racines[0] == racines[1]) {
			System.out
					.println("L'equation a une racine double : " + racines[0]);
		} else {
			System.out.println("L'equation a deux solutions : " + racines[0]
					+ " et " + racines[1]);
		}
	}
}
