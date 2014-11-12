package applicr ;

import java.util.* ;
import javax.swing.table.* ;

/** Modèle du tableau des Praticiens Hesitants
 * 
 * @author xilim
 *
 */
public class ModeleListePraticiens extends AbstractTableModel {
	
	private List<Praticien> Praticiens ;
	private final String[] entetes = {"Nom","Ville","Coeff confiance","Temps Ecoule","Coeff Notoriete"} ;
	
	private Modele modele ;
	
	/** Créer le modèle de la liste des Praticiens
	 * 
	 * @param modele Le modèle de l'application
	 */
	public ModeleListePraticiens(Modele modele){
		super() ; 
		System.out.println("ModeleListePraticiens::ModeleListePraticiens()") ;
		this.modele = modele ;
		Praticiens = modele.getPraticiens() ;
	}
	
	/** Obtenir le nombre de lignes
	 * 
	 * @return Le nombre de lignes
	 */
	public int getRowCount(){
		//System.out.println("ModeleListePraticiens::getRowCount()") ;
		return Praticiens.size() ;
	}

	/** Obtenir le nombre de colonnes
	 * 
	 * @return Le nombre de colonnes
	 */
	public int getColumnCount(){
		//System.out.println("ModeleListePraticiensH::getColumnCount()") ;
		return entetes.length ;
	}
	
	/** Obtenir le nom d'une colonne
	 * 
	 * @param indiceColonne L'indice de la colonne
	 * @return Le nom de la colonne
	 */
	public String getColumnName(int indiceColonne){
		//System.out.println("ModeleListePraticiensH::getColumnName()") ;
		return entetes[indiceColonne] ;
	}
	
	/** Obtenir la valeur d'une cellule
	 * 
	 * @param indiceLigne L'indice de la ligne
	 * @param indiceColonne L'indice de la colonne
	 * @return La valeur de la cellule
	 */
	public Object getValueAt(int indiceLigne, int indiceColonne){
		//System.out.println("ModeleListePraticiensH::getValueAt()") ;
		switch(indiceColonne){
			case 0 : 
				return "nom";
			case 1 : 
				return "ville";
			case 2 :
				return "coeff Confiance" ;
			case 3 : 
				return "temps ecoule";
			case 4 :
				return "coeff notoriete";
			default :
				return null ;
		}
	}
	
}
