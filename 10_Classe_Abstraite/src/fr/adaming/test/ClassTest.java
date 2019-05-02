package fr.adaming.test;

import fr.adaming.model.CompteCourant;

public class ClassTest {

	public static void main(String[] args) {
		// Compte c = new Compte(); //pas possible car Compte est abstraite

		CompteCourant cc = new CompteCourant();

		cc.depotArgent(10);
	}

}
