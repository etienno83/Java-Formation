package fr.adaming.model.heritage;

public class Scolaire extends Personne {
	
	public String nom_etablissement;
	public String niveau;

	

	public Scolaire() {
		super();
	}


	public Scolaire(String nom, int age, String nom_etablissement, String niveau) {
		super(nom, age);
		this.nom_etablissement = nom_etablissement;
		this.niveau = niveau;
	}


	public String getNom_etablissement() {
		return nom_etablissement;
	}


	public void setNom_etablissement(String nom_etablissement) {
		this.nom_etablissement = nom_etablissement;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	
}
