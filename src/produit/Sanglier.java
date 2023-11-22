package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	
	float poids;
	Gaulois chasseur;
	
	public Sanglier(float poids, Gaulois chasseur) {
		super("Sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String decrireProduit() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(nom);
		chaine.append(" de ");
		chaine.append(poids);
		chaine.append(unite.toString());
		chaine.append(" chass� par ");
		chaine.append(chasseur.getNom());
		return chaine.toString();
	}

}
