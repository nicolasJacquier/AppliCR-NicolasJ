package applicr;
import java.sql.Date;


public class Visiteur {
	
	private String matricule;
	private String nom;
	private String prenom;
	private String adresse;
	private int cP;
	private String ville;
	private Date dateEmbauche;
	private String mdp;
	private boolean estDelegue;
	
	
	public Visiteur(String matricule, String nom, String prenom, String adresse, int cP, String ville, Date dateEmbauche, String mdp, boolean estDelegue){
		
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cP = cP;
		this.ville = ville;
		this.dateEmbauche = dateEmbauche;
		this.mdp = mdp;
		this.estDelegue = estDelegue;
		
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isEstDelegue() {
		return estDelegue;
	}

	public void setEstDelegue(boolean estDelegue) {
		this.estDelegue = estDelegue;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	public int getcP() {
		return cP;
	}

	public void setcP(int cP) {
		this.cP = cP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	public String toString() {
		return "Visiteur "+ matricule +" "+ nom +" "+ prenom +" "+ adresse +" "+ cP +" "+ ville +" "+dateEmbauche+" "+mdp+" "+ estDelegue ;
	}
}
