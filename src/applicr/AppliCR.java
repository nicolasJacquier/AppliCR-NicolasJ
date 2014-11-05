package applicr;

/** Classe principale de l'application
 * 
 * @author xilim
 *
 */
public class AppliCR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("applicr::main()") ;
		
		System.out.println(" [Creation du modele]") ;
		ModeleLocations modele = new ModeleLocations() ;
		
		System.out.println(" [Creation du controleur]") ;
		Controleur controleur = new Controleur(modele) ;
		
		System.out.println(" [Creation de la vue principale]") ;
		new GuiAppliCR(modele,controleur) ;
	}

}
