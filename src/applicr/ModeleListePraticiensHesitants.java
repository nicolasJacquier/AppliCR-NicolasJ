package applicr ;

import java.util.* ;
import javax.swing.table.* ;

/** Modèle du tableau des PraticiensHesitants
 * 
 * @author xilim
 *
 */
public class ModeleListePraticiensHesitants extends AbstractTableModel {
	
	private List<PraticienHesitant> PraticiensHesitants ;
	private final String[] entetes = {"Nom","Ville","Coeffconfiance","Temps Ecoule","Coeff Notoriete"} ;
	
	private ModeleLocations modele ;
	
	/** Créer le modèle de la liste des PraticiensHesitants
	 * 
	 * @param modele Le modèle de l'application
	 */
	public ModeleListePraticiensHesitants(ModeleLocations modele){
		super() ; 
		System.out.println("ModeleListePraticiensHesitants::ModeleListePraticiensHesitants()") ;
		this.modele = modele ;
		PraticiensHesitants = modele.getPraticiensHesitants() ;
	}
	
	/** Obtenir le nombre de lignes
	 * 
	 * @return Le nombre de lignes
	 */
	public int getRowCount(){
		//System.out.println("ModeleListePraticiensHesitants::getRowCount()") ;
		return PraticiensHesitants.size() ;
	}

	/** Obtenir le nombre de colonnes
	 * 
	 * @return Le nombre de colonnes
	 */
	public int getColumnCount(){
		//System.out.println("ModeleListePraticiensHesitants::getColumnCount()") ;
		return entetes.length ;
	}
	
	/** Obtenir le nom d'une colonne
	 * 
	 * @param indiceColonne L'indice de la colonne
	 * @return Le nom de la colonne
	 */
	public String getColumnName(int indiceColonne){
		//System.out.println("ModeleListePraticiensHesitants::getColumnName()") ;
		return entetes[indiceColonne] ;
	}
	
	/** Obtenir la valeur d'une cellule
	 * 
	 * @param indiceLigne L'indice de la ligne
	 * @param indiceColonne L'indice de la colonne
	 * @return La valeur de la cellule
	 */
	public Object getValueAt(int indiceLigne, int indiceColonne){
		//System.out.println("ModeleListePraticiensHesitants::getValueAt()") ;
		switch(indiceColonne){
			case 0 : 
				return "nom";
			case 1 : 
				return "ville";
			case 2 :
				return "coeffConfiance" ;
			case 3 : 
				return "temps ecoule";
			case 4 :
				return "coeff notoriete";
			default :
				return null ;
		}
	}
	
}
