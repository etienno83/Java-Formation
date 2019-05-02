package fr.adaming.test;

import fr.adaming.model.Personne;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration d'une variable de type objet
		Personne p1;
		
		//construire des objets dans la memoire (instancier des objets de la classe Personne) 
		//grace a l'operateur new suivit du constructeur de la classe
		
		p1 = new Personne();
		
		System.out.println(p1);
		System.out.println("La valeur du nom de p1 est : " + p1.getNom());
		//Affecter des valeurs aux attributs du p1 
		p1.setNom("ToTo");
		p1.setAge(27);
		p1.prenom = "Etienne";
		System.out.println(p1.getNom() + p1.prenom + p1.getAge());
		p1.manger("couscous");
		
		//appel de la methode marcher et stocker son retour 
		//dans une variable afin de le manipuler par lsuite
		double a = p1.marcher();
		System.out.println(a);
		
		//creer un objet avec un constructeur avec parametres
		Personne p2 = new Personne("Le Vaguerese", "Etienne", 27);
		
		//appel de la methode de recuperation
		String s = p2.recupInfo();
		System.out.println(s);
	}

}
