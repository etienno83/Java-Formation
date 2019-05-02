package fr.adaming.model;

public abstract class Compte {

	protected String nomTitulaire;
	protected int numCompte;
	protected double solde;

	public Compte() {
		super();
	}

	public Compte(String nomTitulaire, int numCompte, double solde) {
		super();
		this.nomTitulaire = nomTitulaire;
		this.numCompte = numCompte;
		this.solde = solde;
	}

	public String getNomTitulaire() {
		return nomTitulaire;
	}

	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void depotArgent(double somme) {
		this.solde += somme;
	}

	// methode abstraite, cf Resume.txt
	public abstract void retraitArgent(double somme);
}
