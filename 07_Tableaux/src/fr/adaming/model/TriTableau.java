package fr.adaming.model;

public class TriTableau {
	
	public int[] trier(int[] tab){
		int temp;
		
		for (int i = 0; i < tab.length; i++) {
			
			
			for (int j = tab.length - 1; j > i; j--) {
				if (tab[j]<tab[i]){
					temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
			}
		}
		return tab;
	}
}