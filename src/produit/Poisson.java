package produit;

public class Poisson extends Produit{
	
	String date;
	
	public Poisson( String date) {
		super("Poisson", null);
		this.date = date;
	}
	
	public String decrireProduit() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(nom);
		chaine.append(" pêché ");
		chaine.append(date);
		return chaine.toString();
	}

}
