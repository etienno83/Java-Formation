package fr.adaming.model.heritage;

public class Lyceen extends Scolaire {
	char bac;
	
	

	public Lyceen() {
		super();
	}

	public Lyceen(String nom, int age, String nom_etablissement, String niveau,
			char bac) {
		super(nom, age, nom_etablissement, niveau);
		this.bac = bac;
	}

	public char getBac() {
		return bac;
	}

	public void setBac(char bac) {
		this.bac = bac;
	}
	
	

}
