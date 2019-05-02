package fr.adaming.model.mairie;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	private String situation;
	
	//traduction de la relation d'association entre Personne et Acte
	private Acte acteMariage;
	
	public Personne() {
		super();
	}


	public Personne(String nom, String prenom, int age, String situation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.situation = situation;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSituation() {
		return situation;
	}


	public void setSituation(String situation) {
		this.situation = situation;
	}

	

	public Acte getActeMariage() {
		return acteMariage;
	}


	public void setActeMariage(Acte acteMariage) {
		this.acteMariage = acteMariage;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", situation=" + situation + "]";
	}
	
	
	
	
	

}
