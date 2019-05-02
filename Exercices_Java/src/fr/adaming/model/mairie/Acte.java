package fr.adaming.model.mairie;

public class Acte {

	private int numeroActe;

	// traduction de la relation multi entre acte et Personne

	private Personne conjoint1;
	private Personne conjoint2;

	public Acte() {
		super();
	}

	public Acte(int numeroActe) {
		super();
		this.numeroActe = numeroActe;
	}

	  public Personne getConjoint1() {
		return conjoint1;
	}

	public void setConjoint1(Personne conjoint1) {
		this.conjoint1 = conjoint1;
	}

	public Personne getConjoint2() {
		return conjoint2;
	}

	public void setConjoint2(Personne conjoint2) {
		this.conjoint2 = conjoint2;
	}

	public int getNumeroActe() {
		return numeroActe;
	}

	public void setNumeroActe(int numeroActe) {
		this.numeroActe = numeroActe;
	}

	@Override
	public String toString() {
		return "Acte [numeroActe=" + numeroActe + "]";
	}

}