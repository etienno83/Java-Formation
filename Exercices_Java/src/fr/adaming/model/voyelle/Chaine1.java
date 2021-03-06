package fr.adaming.model.voyelle;

public class Chaine1 {

	// public StringBuilder[] extraire(String str) {
	// StringBuilder vo = new StringBuilder();
	// StringBuilder co = new StringBuilder();
	// for (int j = 0; j < str.length(); j++) {
	// char v = str.charAt(j);

	// if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y')
	// vo.append(v);
	// } else if(v!=' '){
	// co.append(str.charAt(j));
	// }
	// }
	// StringBuilder resultat[] = {vo, co}
	// return resultat;
	// }

	// Correction du prof
	// Declarer les voyelles et les consomnes

	String voyelles = "aeiuoy";
	String consomnes = "zrtpqsdfghjklmwxcvbn";

	public StringBuilder[] extraction(String phrase) {
		// Declarer les variables locales ou on va stocker
		// les voyelles et les consomnes de la chaine phrase
		StringBuilder vo = new StringBuilder();
		StringBuilder co = new StringBuilder();

		for (int i = 0; i < phrase.length(); i++) {
			// recuperer le caractere qui correspond a i de chaque iteration
			char c = phrase.charAt(i);

			// transformer c en String pour le if
			String temp = Character.toString(c);
			
			temp = temp.toLowerCase();

			if (voyelles.contains(temp)) {
				vo.append(c);
			} else if (consomnes.contains(temp)) {
				co.append(c);
			}

		}
		StringBuilder resultat[] = { vo, co };
		return resultat;
	}
}
