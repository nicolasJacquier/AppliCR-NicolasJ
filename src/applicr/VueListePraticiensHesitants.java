package applicr;

import java.util.* ;
import java.awt.FlowLayout;

import java.awt.* ;
import javax.swing.* ;
import javax.swing.JTable.* ;

/** Vue dédiée à l'affichage de la liste des PraticiensHesitants
 * 
 * @author xilim
 *
 */
public class VueListePraticiensHesitants extends JPanel {

	private static final long serialVersionUID = 1L;
	private Controleur controleur ;
	private ModeleLocations modele ;
	
	private ModeleListePraticiensHesitants modeleTableauPraticiensHesitants ;
	private JTable tableauPraticiensHesitants ;
	
	/** Créer la vue dédiée à l'affichage de la liste des PraticiensHesitants
	 * 
	 * @param modele Le modèle
	 * @param controleur Le contrôleur
	 */
	public VueListePraticiensHesitants(ModeleLocations modele, Controleur controleur) {
		super();
		System.out.println("VueListePraticiensHesitants::VueListePraticiensHesitants()") ;
		
		this.modele = modele ;
		this.controleur = controleur ;
		
		Box boxPrincipal = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTableau = Box.createHorizontalBox() ;

		boxEtiquette.add(new JLabel("PraticiensHesitants :")) ;
		boxEtiquette.add(Box.createHorizontalGlue()) ;
		
		modeleTableauPraticiensHesitants = new ModeleListePraticiensHesitants(modele) ;
		tableauPraticiensHesitants = new JTable(modeleTableauPraticiensHesitants) ;
		tableauPraticiensHesitants.setRowHeight(30) ;
		
		JScrollPane spPraticiensHesitants = new JScrollPane(tableauPraticiensHesitants) ;
		//spPraticiensHesitants.setPreferredSize(new Dimension(1290,420)) ;
		spPraticiensHesitants.setPreferredSize(new Dimension(1090,420)) ;
		
		boxTableau.add(spPraticiensHesitants) ;
		
		boxPrincipal.add(boxEtiquette) ;
		boxPrincipal.add(boxTableau) ;
		
		this.add(boxPrincipal) ;
		
	}
	
	/** Actualiser le modèle du tableau
	 * 
	 */
	public void actualiser(){
		System.out.println("VueListePraticiensHesitants::actualiser()") ;
		modeleTableauPraticiensHesitants = new ModeleListePraticiensHesitants(modele) ;
		tableauPraticiensHesitants.setModel(modeleTableauPraticiensHesitants) ;
	}
	
}
