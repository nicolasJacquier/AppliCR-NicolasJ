package applicr;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/** Vue principale 
 * 
 * @author xilim
 *
 */
public class GuiAppliCR extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private ModeleLocations modele ;
	private Controleur controleur ;
		
	private JMenuItem itemQuitter ;

	private JMenuItem itemVisualiserPraticiensHesitants ;




	private VueListePraticiensHesitants vueVisualiserPraticiensHesitants ;

	
	
	
	private CardLayout vues ;
	private Container conteneur ;

	/** Construire la vue principale de l'application
	 * 
	 * @param modele Le modèle
	 * @param controleur Le contrôleur
	 */
	public GuiAppliCR(ModeleLocations modele, Controleur controleur) {
		super();
		System.out.println("Guiapplicr::Guiapplicr()") ;
		this.modele = modele;
		this.controleur = controleur ;
		this.controleur.setVuePrincipales(this);
		
		this.setTitle("applicr") ;
		//this.setSize(1300,500) ; 
		this.setSize(1120,520) ;
		this.setLocationRelativeTo(null) ;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		
		this.vues = new CardLayout(2,2) ;
		this.conteneur = this.getContentPane() ;
		this.conteneur.setLayout(this.vues) ;
		

		vueVisualiserPraticiensHesitants = new VueListePraticiensHesitants(modele,controleur) ;



	
		

		this.conteneur.add(vueVisualiserPraticiensHesitants,"Liste PraticiensHesitants") ;



		
	
		this.vues.show(this.conteneur, "Liste locations");
		
		this.creerBarreMenus() ;
		this.setVisible(true) ;
		
	}
	
	/** Obtenir le contrôleur
	 * 
	 * @return Le contrôleur
	 */
	public Controleur getControleur() {
		System.out.println("Guiapplicr::getControleur()") ;
		return this.controleur;
	}

	/** Modifier le contrôleur
	 * 
	 * @param controleur Le nouveau contrôleur
	 */
	public void setControleur(Controleur controleur) {
		System.out.println("Guiapplicr::setControleur()") ;
		this.controleur = controleur;
	}

	/** Obtenir le modèle
	 * 
	 * @return Le modèle
	 */
	public ModeleLocations getModele() {
		System.out.println("Guiapplicr::getModele()") ;
		return this.modele;
	}

	/** Modifier le modèle
	 * 
	 * @param modele Le nouveau modèle
	 */
	public void setModele(ModeleLocations modele) {
		System.out.println("Guiapplicr::setModele()") ;
		this.modele = modele;
	}

	/** Créer la barre de menus
	 * 
	 */
	private void creerBarreMenus(){
		System.out.println("Guiapplicr::creerBarreMenus()") ;
		JMenuBar barreMenus = new JMenuBar() ;
		
		JMenu menuFichier = new JMenu("Fichier") ;
		this.itemQuitter = new JMenuItem("Quitter") ;
		this.itemQuitter.addActionListener(this) ;
		menuFichier.add(this.itemQuitter) ;
		

		JMenu menuPraticiensHesitants = new JMenu("PraticiensHesitants") ;
		this.itemVisualiserPraticiensHesitants = new JMenuItem("Liste des PraticiensHesitants") ;
		this.itemVisualiserPraticiensHesitants.addActionListener(this) ;
		menuPraticiensHesitants.add(this.itemVisualiserPraticiensHesitants) ;

		
		barreMenus.add(menuFichier) ;
		barreMenus.add(menuPraticiensHesitants) ;

		
		this.setJMenuBar(barreMenus) ;
	}
	
	/** Basculer sur l'une des vues
	 * 
	 * @param nomVue La vue qui doit passer au premier plan
	 */
	public void changerDeVue(String nomVue){
		System.out.println("Guiapplicr::changerVue()") ;

		if(nomVue.equals("Liste PraticiensHesitants")){
			this.vueVisualiserPraticiensHesitants.actualiser() ;
		}

		this.vues.show(this.conteneur,nomVue) ;
	}

	/** Gérer les actions de l'utilisateur
	 * 
	 * @param evenement L'événement utilisateur
	 */
	@Override
	public void actionPerformed(ActionEvent evenement) {
		System.out.println("----------------------------------------") ;
		System.out.println("Guiapplicr::actionPerformed()") ;
		Object sourceEvt = evenement.getSource() ;
		
		if(sourceEvt == this.itemQuitter){
			this.controleur.quitterApplication() ;
		}

		
		else if(sourceEvt == this.itemVisualiserPraticiensHesitants){
			this.controleur.visualiserPraticiensHesitants() ;
		}

		
		
	}
	
}
