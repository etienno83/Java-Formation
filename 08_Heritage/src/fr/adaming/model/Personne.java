package fr.adaming.model;

public class Personne {

	// Declaration des attributs de la classe Personne
	private String nom;
	protected String prenom;
	public int age;

	// declaration des constructeurs vide et avec parametres
	public Personne() {
		System.out.println("Je suis le constructeur vide de Personne");
	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		System.out
				.println("Je suis le constructeur avec parametres de Personne");
	}

	// declaration des getters et setters
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// les methodes
	public void manger() {
		System.out.println("Je suis une personne donc je mange");
	}
}
