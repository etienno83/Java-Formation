package fr.adaming.test;

import fr.adaming.model.TriTableau;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration et initialiation du tableau a ordonner
		int[] montab = {15,2,10,8,3,50,19};
		
		//instancier un objet de type TriTableau afin d'appeler sa methode (non static!) 
		//trier
		TriTableau tt = new TriTableau();
		
		//appel de la methode trier de l'objet tt (mui envpyer un message pour
		//trier le tableau
		int[] resultat = tt.trier(montab);
		
		//exploitation du retour de la methode trier
		for(int elem : resultat){
			System.out.println(elem+"");
		}
	}

}