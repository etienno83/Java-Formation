package fr.adaming.test.voyelle;

import java.util.Scanner;

import fr.adaming.model.voyelle.Chaine1;

public class ClassTestVoyelle {

	public static void main(String[] args) {
		// pour appeler une m�thode non static il faut instancier un objet:
		Chaine1 ch = new Chaine1();

		Scanner sc = new Scanner(System.in);

		System.out.println("Tapez une phrase sans accents");

		String phrasetest = sc.nextLine();

		// Declaration du retour
		StringBuilder[] retour = ch.extraction(phrasetest);

		System.out
				.println("Les voyelles de la phrase test sont : " + retour[0]);
		System.out.println("\nLes consomnes de la phrase test sont : "
				+ retour[1]);
		sc.close();
	}
}
