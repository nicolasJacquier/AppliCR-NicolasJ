package applicr;

/** Représenter un Praticien de l'agence
 * 
 * @author xilim
 *
 */
public class Praticien {
	private String nom ;
	private String ville ;
	private int coefC ;
	private int coefN ;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCoefC() {
		return coefC;
	}

	public void setCoefC(int coefC) {
		this.coefC = coefC;
	}

	public int getCoefN() {
		return coefN;
	}

	public void setCoefN(int coefN) {
		this.coefN = coefN;
	}

	public Praticien(String nom, String ville, int coefC, int coefN) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.coefC = coefC;
		this.coefN = coefN;
	}

	public String toString() {
		return "Praticien [nom=" + nom + ", ville=" + ville + ", coefC="
				+ coefC + ", coefN=" + coefN + "]";
	}

}
