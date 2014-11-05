package applicr;

import java.util.* ;

/** Contrôleur de l'application
 * 
 * @author xilim
 *
 */
public class Controleur {

	private GuiAppliCR vuePrincipale ;
	private ModeleLocations modele ;
	
	/** Créer le contrôleur
	 * 
	 * @param modele Le modèle
	 */
	public Controleur(ModeleLocations modele) {
		super();
		System.out.println("Controleur::Controleur()") ;
		this.modele = modele;
	}
	
	/** Obtenir la vue principale
	 * 
	 * @return La vue principale
	 */
	public GuiAppliCR getVuePrincipale() {
		System.out.println("Controleur::getVuePrincipale()") ;
		return vuePrincipale ;
	}

	/** Modifier la vue principale
	 * 
	 * @param vuePrincipale La nouvelle vue principale
	 */
	public void setVuePrincipales(GuiAppliCR vuePrincipale) {
		System.out.println("Controleur::setVuePrincipale()") ;
		this.vuePrincipale = vuePrincipale ;
	}
	
	/** Visualiser la liste des PraticiensHesitants sous une forme tabulaire
	 * 
	 */
	public void visualiserPraticiensHesitants(){
		System.out.println("Controleur::visualiserPraticiensHesitants()") ;
		this.vuePrincipale.changerDeVue("Liste PraticiensHesitants");
	}
	

	
	/** Quitter l'application
	 * 
	 */
	public void quitterApplication(){
		System.out.println("Controleur::quitterApplication()") ;
		System.exit(0) ;
	}
	
	/** Visualiser les données de la couche "Logique Métier"
	 * 
	 */
	public void visualiserModele(){
		System.out.println("Controleur::visualiserModele()") ;
		System.out.println("") ;

		System.out.println("------------------- PraticiensHesitants -----------------------------") ;
		for(PraticienHesitant PraticienHesitant : this.modele.getPraticiensHesitants()){
			System.out.println(PraticienHesitant) ;
		
		}
		System.out.println("") ;
	}
	
}
