package applicr;
import java.util.Date;


public class RapportVisite {
	
	private int numero;
	private Date date;
	private String bilan;
	private String motif;
	private int coefConfiance;
	
	public RapportVisite(int numero, Date date, String bilan, String motif, int coefConfiance){
		
	this.numero = numero;
	this.date = date;
	this.bilan = bilan;
	this.motif = motif;
	this.coefConfiance = coefConfiance;
	}


	public int getCoefConfiance() {
		return coefConfiance;
	}


	public void setCoefConfiance(int coefConfiance) {
		this.coefConfiance = coefConfiance;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getBilan() {
		return bilan;
	}


	public void setBilan(String bilan) {
		this.bilan = bilan;
	}


	public String getMotif() {
		return motif;
	}


	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	public String toString() {
		return "RapportVisite "+ numero +" "+ date +" "+ bilan +" "+ motif ;
	}
}
