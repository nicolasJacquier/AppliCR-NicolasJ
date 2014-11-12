package applicr;

/** Classe principale de l'application
 * 
 * @author xilim
 *
 */
public class Applicr {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Applicr::main()") ;
		
		System.out.println(" [Creation du modele]") ;
		Modele modele = new Modele() ;
		
		System.out.println(" [Creation du controleur]") ;
		Controleur controleur = new Controleur(modele) ;
		
		System.out.println(" [Creation de la vue principale]") ;
		new Guiapplicr(modele,controleur) ;
	}

}
