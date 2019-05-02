package fr.adaming.model.second.degre;

public class RacineSecondDegre {

	public Double[] calculRacine(double a, double b, double c) {

		// Declarer et initialiser delta
		double delta = b * b - 4 * a * c;

		Double[] resultat = new Double[2];
		if (delta > 0) {
			double racine1 = (-b + Math.sqrt(delta)) / 2 * a;
			double racine2 = (-b - Math.sqrt(delta)) / 2 * a;
			resultat[0] = racine1;
			resultat[1] = racine2;
		} else if (delta == 0) {
			double racine0 = -b / 2 * a;
			resultat[0] = racine0;
			resultat[1] = racine0;
		} else {
			resultat[0] = null;
			resultat[1] = null;
		}
		return resultat;
	}

}
