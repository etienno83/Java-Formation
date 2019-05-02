package fr.adaming.service.mairie;

import fr.adaming.model.mairie.Acte;
import fr.adaming.model.mairie.Personne;

public class Mairie {
	
	private String adresse;
	private String nom;
	
	public Mairie() {
		super();
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Mairie(String adresse, String nom) {
		super();
		this.adresse = adresse;
		this.nom = nom;
	}
	
	public boolean unirCouple(Personne p1,Personne p2){
		if(p1.getSituation().equals("Célibataire")&&p2.getSituation().equals("Célibataire")){
			return true;
		}else{
			return false;
		}
	}
	
	public Acte etablirActe(){
		return new Acte((int)Math.random()*1000);
		
	}
	
	public void remettreActe(Personne p1, Personne p2,Acte a){
		//stocker l'acte dans l'attribut acteMariage de p1 et p2
		p1.setActeMariage(a);
		p2.setActeMariage(a);
		
		//stocker les personnes p1 et p2 dans epoux et epouses
		a.setConjoint1(p1);
		a.setConjoint2(p2);
	}

}
