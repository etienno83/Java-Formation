package fr.adaming.cours;

public class ClassCours {

	public static void main(String[] args) {
		
		//declaration d'un tableau en java
		String semaine[];
		
		//instancier le tableau
		semaine = new String[7];
		
		//stocker des valeurs dans le tableau
		semaine[0]="Lundi";
		semaine[0]="Mardi";
		semaine[0]="Mercredi";
		semaine[0]="Jeudi";
		semaine[0]="Vendredi";
		
		//creation d'un tableau vide puis instanciation
		int[] tab1 = new int[100];
		tab1[0] = 1;
		//et ainso de suite
		
		//creation d'un tableau initialis�
		int[] tab2 = {1,2,3,4,5};
		
		//remplir tableau grace � la boucle for
		for(int i = 0; i < tab1.length; i++){
			tab1[i] =101 + i;
		}
		
		//lire un tableau
		for(int i = 0; i < tab1.length; i++){
			//System.out.println(tab1[i]);
	}
		//System.out.println("for each");
		
		//lire un tableau grace � la boucle for each, pour chaque "elem" du tableau tab2 il va faire quelque chose 
		for (int elem : tab1) {
			//System.out.println(elem);
			
		}		
		int tab3[] = {15,2,10,8,3,50,19};

		
	}
	
}