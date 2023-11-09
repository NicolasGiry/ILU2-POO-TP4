package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal <P extends IProduit> {
	Gaulois vendeur;
	P[] produits;
	int quantite;
	int prix;
	
	public void installerVendeur(Gaulois vendeur, P[] produits, int prix) {
		this.vendeur = vendeur;
		this.produits = produits;
		this.prix = prix;
		this.quantite = produits.length;
	}
}
