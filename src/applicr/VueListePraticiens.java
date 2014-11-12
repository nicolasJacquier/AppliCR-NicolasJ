package applicr;

import java.util.* ;
import java.awt.FlowLayout;

import java.awt.* ;
import javax.swing.* ;
import javax.swing.JTable.* ;

/** Vue dédiée à l'affichage de la liste des Praticiens Hesitants
 * 
 * @author xilim
 *
 */
public class VueListePraticiens extends JPanel {

	private static final long serialVersionUID = 1L;
	private Controleur controleur ;
	private Modele modele ;
	
	private ModeleListePraticiens modeleTableauPraticiensH ;
	private JTable tableauPraticiensH ;
	
	/** Créer la vue dédiée à l'affichage de la liste des Praticiens Hesitants
	 * 
	 * @param modele Le modèle
	 * @param controleur Le contrôleur
	 */
	public VueListePraticiens(Modele modele, Controleur controleur) {
		super();
		System.out.println("VueListePraticiensH::VueListePraticiensH()") ;
		
		this.modele = modele ;
		this.controleur = controleur ;
		
		Box boxPrincipal = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTableau = Box.createHorizontalBox() ;

		boxEtiquette.add(new JLabel("Praticiens Hesitants :")) ;
		boxEtiquette.add(Box.createHorizontalGlue()) ;
		
		modeleTableauPraticiensH = new ModeleListePraticiens(modele) ;
		tableauPraticiensH = new JTable(modeleTableauPraticiensH) ;
		tableauPraticiensH.setRowHeight(30) ;
		
		JScrollPane spPraticiensH = new JScrollPane(tableauPraticiensH) ;
		
		spPraticiensH.setPreferredSize(new Dimension(1090,420)) ;
		
		boxTableau.add(spPraticiensH) ;
		
		boxPrincipal.add(boxEtiquette) ;
		boxPrincipal.add(boxTableau) ;
		
		this.add(boxPrincipal) ;
		
	}
	
	/** Actualiser le modèle du tableau
	 * 
	 */
	public void actualiser(){
		System.out.println("VueListePraticiensH::actualiser()") ;
		modeleTableauPraticiensH = new ModeleListePraticiens(modele) ;
		tableauPraticiensH.setModel(modeleTableauPraticiensH) ;
	}
	
}
