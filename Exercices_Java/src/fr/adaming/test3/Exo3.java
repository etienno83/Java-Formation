package fr.adaming.test3;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		String rep;
		int str;
		do{
			System.out.println("Voulez vous jouer?");
			System.out.println("O pour Oui");
			System.out.println("N pour Non");
			rep = sc.nextLine();
			do{
				System.out.println("Veuillez saisir un nombre, pour arreter de jouer pressez le chiffre 0 :");
				str = sc.nextInt();
				if (str == 0){
					System.out.println("bye");
				}
				if (str>0){
					System.out.println(str + " est positif.");
				}
				else{
					System.out.println(str + " est négatif.");
				}
				if(str%2 == 0){
					System.out.println(str + "est pair.");
				}
				else{
					System.out.println(str + "est impair.");
				}
			}while(str != 0);
			sc.close();
		}while(rep != "N");
	}
}

