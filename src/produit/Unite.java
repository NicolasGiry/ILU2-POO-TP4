package produit;

public enum Unite {
	GRAMME("g"), KILOGRAMME("kg"), LITRE("L"), CENTILITRE("cL"), MILILITRE("mL"), PIECE("");
	
	private String nom;
	
	private  Unite (String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
