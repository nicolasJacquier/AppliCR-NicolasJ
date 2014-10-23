package applicr;




public class Praticien {
		
	private int numero;
	private String nom;
	private String prenom;
	private String adresse;
	private int cP;
	private String ville;
	private int coefNotoriete;
	
	
	public Praticien(int numero,String nom, String prenom, String adresse, int cP, String ville, int coefNotoriete){
		
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cP = cP;
		this.ville = ville;
		this.coefNotoriete = coefNotoriete;
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCP() {
		return cP;
	}


	public void setCP(int cP) {
		this.cP = cP;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getCoefNotoriete() {
		return coefNotoriete;
	}


	public void setCoefNotoriete(int coefNotoriete) {
		this.coefNotoriete = coefNotoriete;
	}
	
	public String toString() {
		return "Praticien"+ numero +" "+ nom +" "+ prenom +" "+ adresse+" "+ cP +" "+ ville+ " "+ coefNotoriete ;
	}
	
}
