package fr.adaming.model;

public class CompteCourant extends Compte {

	//afin que la classe Compte Courant ne soit pas abstraite par defaut (elle h�rite d'une classe abstraite qui contient une m�thode abstraite donc elle est abstraite par d�faut. Pour la rendre concrete il fautappeler la m�thode abstraite et la rende concrete (clique droit sur Compte Courant et choisi la unimplemented method.
	@Override
	public void retraitArgent(double somme) {
		this.solde-=somme;
		
	}

}
