package fr.adaming.model.choix.multiples;

public class Reservation {

	// declaration des attributs
	String categories = new String();
	int nbPlaces;
	int montant;
	int prixPlace;

	// declaration du constructeur avec params
	public Reservation(String categories, int nbPlaces) {
		super();
		this.categories = categories;
		this.nbPlaces = nbPlaces;

		switch (categories) {
		case "VIP +":
			prixPlace = 25;
			montant = prixPlace * nbPlaces;
			System.out.println("Le montant total est de : " + montant);
			break;

		case "VIP -":
			prixPlace = 20;
			montant = prixPlace * nbPlaces;
			System.out.println("Le montant total est de : " + montant);
			break;

		case "Normale +":
			prixPlace = 15;
			montant = prixPlace * nbPlaces;
			System.out.println("Le montant total est de : " + montant);
			break;

		case "Normale -":
			prixPlace = 10;
			montant = prixPlace * nbPlaces;
			System.out.println("Le montant total est de : " + montant);
			break;
		default:
			break;
		}
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public int getNbplaces() {
		return nbPlaces;
	}

	public void setNbplaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public int getPrixPlace() {
		return prixPlace;
	}

	public void setPrixPlace(int prixPlace) {
		this.prixPlace = prixPlace;
	}

}