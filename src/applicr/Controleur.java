package applicr;


import applicr.GuiAppliCR;

public class Controleur {

	private GuiAppliCR vuePrincipale ;
	private ModeleAppliCR modele ;
	
	public Controleur(ModeleAppliCR modele) {
		super();
		this.modele = modele;
	}

	public GuiAppliCR getVuePrincipale() {
		return vuePrincipale;
	}

	public void setVuePrincipale(GuiAppliCR vuePrincipale) {
		this.vuePrincipale = vuePrincipale;
	}

	public ModeleAppliCR getModele() {
		return modele;
	}

	public void setModele(ModeleAppliCR modele) {
		this.modele = modele;
	}
	
	public void seConnecter(){
		
	}
	
	public void seDeconnecter(){
		this.vuePrincipale.changerDeVue("Se déconnecter") ;
	}
	
	public void quitterApplication(){
		this.vuePrincipale.changerDeVue("Quitter") ;
	}
	
	public void visualiserVisiteurs(){
		
	}
	
	public void visualiserPraticiensHesitants(){
		
	}
	
	public void visualiserComptesRendus(){
		
	}
	
	public void tenterConnexion(String login, String mdp){
		
	}
	
	public void quitter(){
		System.exit(0) ;
	}
}
