package fr.adaming.test;

import fr.adaming.model.Etudiant;
import fr.adaming.model.Personne;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancier un etudiant
		//Etudiant e1 = new Etudiant();
		
		//instancier un etudiant avec un constructeur avec parametres
		Etudiant e2 = new Etudiant("Roger", "Rabbit", 27, 1245);
		
		System.out.println(e2.getNom());
		
		Personne e3 = new Etudiant(); 
		
		//consequence directe du polymorphisme est de typer les objets de la classe fille 
		//par la classe  mere
		//e3.reviser("c#");
		e3.manger();
	}
}