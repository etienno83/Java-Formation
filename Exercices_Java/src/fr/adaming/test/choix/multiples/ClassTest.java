package fr.adaming.test.choix.multiples;

import java.util.Scanner;

import fr.adaming.model.choix.multiples.Reservation;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle categories?");
		String cat = sc.nextLine();
		System.out.println("Nombre de places?");
		int pl = sc.nextInt();

		Reservation r = new Reservation(cat, pl);
		System.out.println(r);
		sc.close();
	}
}
