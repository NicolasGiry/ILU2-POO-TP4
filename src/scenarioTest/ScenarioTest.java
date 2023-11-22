package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		/*
		Gaulois obelix = new Gaulois("Ob�lix", 20);
		
		Sanglier s = new Sanglier(15, obelix);
		Poisson p = new Poisson("mardi");
		
		
		System.out.println(s.decrireProduit());
		System.out.println(p.decrireProduit());
		
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		etals[0] = etalSanglier;
		etals[1] = etalPoisson;
		etals[0].occuperEtal(obelix, p, 10);
		*/
		
		Gaulois ordralfabetix = new Gaulois("Ordralfab�tix",9); 
		Gaulois obelix = new Gaulois("Ob�lix", 20);
		Gaulois asterix = new Gaulois("Asterix",6); 
		
		Sanglier sanglier1 = new Sanglier(2000, obelix); 
		Sanglier sanglier2 = new Sanglier(1500, obelix); 
		Sanglier sanglier3 = new Sanglier(1000, asterix); 
		Sanglier sanglier4 = new Sanglier(500, asterix); 
		Poisson poisson1 = new Poisson("lundi"); 
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2}; 
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4}; 
		Poisson[] poissons = {poisson1};
		
		Etal etalSangliersObelix = new Etal();
		Etal etalSangliersAsterix = new Etal();
		Etal etalPoissons = new Etal();
		
		etalSangliersObelix.installerVendeur(obelix, sangliersObelix, 8);
		etalSangliersAsterix.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoissons.installerVendeur(ordralfabetix, poissons, 7);
		
		
		System.out.println("ETAT MARCHE");
		System.out.println(etalSangliersObelix.etatEtal());
		System.out.println(etalSangliersAsterix.etatEtal());
		System.out.println(etalPoissons.etatEtal());
		
		System.out.println("A l'étal 0 je paye "+etalSangliersObelix.acheterProduit(1)+" sous.");
		System.out.println("A l'étal 1 je paye "+etalSangliersAsterix.acheterProduit(2)+" sous.");

		System.out.println("ETAT MARCHE");
		System.out.println(etalSangliersObelix.etatEtal());
		System.out.println(etalSangliersAsterix.etatEtal());
		System.out.println(etalPoissons.etatEtal());
	}
}
