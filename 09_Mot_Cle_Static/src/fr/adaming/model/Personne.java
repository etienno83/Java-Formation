package fr.adaming.model;

public class Personne {
	
	private String nom;
	private String prenom;
	private static int compteur = 0;
	
	
	public Personne() {
		super();
		compteur++;
	}


	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		//incrementer le compteur afin de compter le nombre d'objet instancier 
		//a partir de cette classe
		compteur++;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getCompteur() {
		return compteur;
	}


	public void setCompteur(int pCompteur) {
		compteur = pCompteur;
	}
	
	public static void manger(){
		System.out.println("je mange");
	}
}
