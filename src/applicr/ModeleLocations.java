package applicr;

import java.util.* ;

/** Modèle de l'application
 * 
 * @author xilim
 *
 */
public class ModeleLocations {
	
	private List<PraticienHesitant> PraticiensHesitants = new ArrayList<PraticienHesitant>() ;
	
	
	/** Créer le modèle
	 * 
	 */
	public ModeleLocations(){
		super() ;
		System.out.println("ModeleLocations::ModeleLocations()") ;
		this.init() ;
	}
	
	/** Peupler la base de données manipulée
	 * 
	 */
	private void init(){
		System.out.println("ModeleLocations::init()") ;

		
		this.PraticiensHesitants.add(new PraticienHesitant(1,"GENPRI","Erwan","0682492032")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(2,"KERREH","Armèle","0638678858")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(3,"TEFFON","Christophe","0627032673")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(5,"ARAUZO","Julien","0639607542")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(6,"MILLET","Antoine","0619264309")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(7,"KIENTZEL","Louis","0729443875")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(8,"BELHADJ","Taslim","0640908628")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(9,"BELLAICHE","Mikaël","0631784099")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(10,"BRIATTE","Guillaume","0628365347")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(11,"COESNOM","Florian","0696784358")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(12,"HURON","Kévin","0721011728")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(13,"JACQUIER","Nicolas","0606293623")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(14,"N'DIAYE","Mamadou","0630879007")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(15,"POIRIER","Nicolas","0657398079")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(16,"RAFINA","Dany","0638586890")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(17,"ROSCO","Steve","0620184981")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(18,"UZAN","Alexis","0667838291")) ;
		this.PraticiensHesitants.add(new PraticienHesitant(19,"WELLE","Guillaume","0659023320")) ;
		

	}
	

	/** Obtenir la liste des PraticiensHesitants
	 * 
	 * @return La liste des PraticiensHesitants
	 */
	public List<PraticienHesitant> getPraticiensHesitants(){
		System.out.println("ModeleLocations::getPraticiensHesitants()") ;
		return this.PraticiensHesitants ;
	}
	

	
	/** Enregistrer un nouveau PraticienHesitant
	 * 
	 * @param nom Le nom
	 * @param prenom Le prénom
	 * @param mobile Le numéro de mobile
	 */
	public void ajouterPraticienHesitant(String nom, String prenom, String mobile){
		System.out.println("ModeleLocations::ajouterPraticienHesitant()") ;
		int numero = genererNumeroPraticienHesitant() ;
		this.PraticiensHesitants.add(new PraticienHesitant(numero,nom,prenom,mobile)) ;
	}
	
	/** Générer un numéro unique de PraticienHesitant
	 * 
	 * @return Le numéro de PraticienHesitant
	 */
	public int genererNumeroPraticienHesitant(){
		System.out.println("ModeleLocations::genererNumeroPraticienHesitant()") ;
		int numMax = 0 ;
		for(PraticienHesitant PraticienHesitant : this.PraticiensHesitants){
			if(PraticienHesitant.getNumero() > numMax){
				numMax = PraticienHesitant.getNumero() ;
			}
		}
		return numMax + 1 ;
	}
	
	
	
	/** Rechercher un PraticienHesitant par son numéro
	 * 
	 * @param numero Le numéro du PraticienHesitant
	 * @return Le PraticienHesitant ou null si le PraticienHesitant n'est pas recensé
	 */
	private PraticienHesitant rechercherPraticienHesitant(int numero){
		System.out.println("ModeleLocations::rechercherPraticienHesitant()") ;
		PraticienHesitant PraticienHesitant = null ;
		int i = 0 ;
		while(i < this.PraticiensHesitants.size() && PraticienHesitant == null){
			if(this.PraticiensHesitants.get(i).getNumero() == numero){
				PraticienHesitant = this.PraticiensHesitants.get(i) ;
			}
			else {
				i += 1 ;
			}
		}
		return PraticienHesitant ;
	}
	

	



	

	

	

	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("ModeleLocations::toString()") ;
		return "MetierLocations ";
	}
	
}
