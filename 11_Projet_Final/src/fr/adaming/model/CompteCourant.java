package fr.adaming.model;

public final class CompteCourant extends Compte {

	private double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String nomTitulaire, int numCompte, double solde,
			double decouvert) {
		super(nomTitulaire, numCompte, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void depotArgent(double somme) {
		// TODO Auto-generated method stub
		super.depotArgent(somme);
	}
	
	

}
