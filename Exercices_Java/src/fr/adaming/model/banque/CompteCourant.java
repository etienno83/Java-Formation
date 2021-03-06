package fr.adaming.model.banque;

public class CompteCourant extends Compte {

	protected double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(int numero, String nomTitulaire, double solde,
			double decouvert) {
		super(numero, nomTitulaire, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void retraitArgent(double montant) {
		if (this.solde - montant >= this.decouvert) {
			this.solde -= montant;
			System.out.println("Vous avez retir� " + montant);
		} else {
			System.out.println("Solde Insufisant");
		}
	}
	
	// redefinir la methode toString herit�e de l'objet
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", numero=" + numero
				+ ", nomTitulaire=" + nomTitulaire + ", solde=" + solde + "]";
	}

	

}
