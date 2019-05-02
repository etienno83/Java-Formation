package fr.adaming.model;

public class Personne {
	
	//1 Declaration des attributs
	private String nom;
	public String prenom;
	private int age;
	
	//2 Declaration des constructeurs
	// a constructeurs vides
	public Personne(){
		
	}
	// b constructeurs remplis
	public Personne(String nom, String prenom, int age){
		this.nom  = nom;
		this.prenom = prenom;
		this.age = age;
	}
	//3 Declaration des accesseurs et des modificateurs
	// a Accesseur (getter)
	public String getNom(){
		return nom;
	}
	public int getAge(){
		return age;
	}
	
	// b modificateur ou setter
	public void setNom(String pNom){
		nom = pNom;
	}
	public void setAge(int pAge){
		if (pAge >= 18){
			age = pAge;
		};
	}
	
	//4 Methodes metiers
	public void manger(String plat){
		System.out.println("Je suis en train de manger " + plat);
	}
	public double marcher(){
		System.out.println("Je suis en train de marcher");
		
		return 4.5;
	}
	public String recupInfo(){
		String infos = "Ton nom est : " + nom + " " + "et ton prénom est : " + prenom + ", enfin ton age est : " + age;
		return infos;
	}
}

