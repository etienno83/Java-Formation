package fr.adaming.test;

public class ProgrammePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration des variables
		byte a;
		
		//affectation des valeurs aux variables
		a=17;
		int m = 8;
		int n = 8;
		System.out.println("La valeur de a est : " + a);
		
		boolean b1 =!(m==n);
		System.out.println("La valeur de b1 est : " +b1);
		//conversion explicite
		int m1 = 400;
		byte m2;
		m2 = (byte)m1;
		System.out.println("la valeur de m2 est : " + m2);
		

	}

}
