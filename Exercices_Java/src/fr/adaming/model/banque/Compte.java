package fr.adaming.model.banque;

public class Compte {

	protected int numero;
	protected String nomTitulaire;
	protected double solde;

	public Compte() {
		super();
	}

	public Compte(int numero, String nomTitulaire, double solde) {
		super();
		this.numero = numero;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomTitulaire() {
		return nomTitulaire;
	}

	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void depotArgent(double montant) {
		this.solde += montant;
	}

	public void retraitArgent(double montant) {
		this.solde -= montant;
	}

	public double consulterSolde() {
		return this.solde;
	}
}
