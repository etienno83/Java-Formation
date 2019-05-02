package fr.adaming.model.heritage;

public class Etudiant extends Scolaire {
	
	public String formation;
	
	

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, int age, String nom_etablissement,
			String niveau, String formation) {
		super(nom, age, nom_etablissement, niveau);
		this.formation = formation;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	

}