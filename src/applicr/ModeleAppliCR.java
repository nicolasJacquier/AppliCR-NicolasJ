package applicr;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import applicr.RapportVisite;
import applicr.Praticien;
import applicr.Visiteur;

public class ModeleAppliCR {

	public ModeleAppliCR(){
		super() ;
	}
	
	public List<Visiteur> getVisiteurs(){
		List<Visiteur> visiteurs = new ArrayList<Visiteur>() ;
		
		return visiteurs ;
	}
	
	public List<RapportVisite> getRapportVisite(int mois, int annee){
		List<RapportVisite> rapportVisite = new ArrayList<RapportVisite>() ;
	;
		
		
		return rapportVisite ;
	}
	
	public List<Praticien> getPraticiens(){
		List<Praticien> praticiens = new ArrayList<Praticien>() ;
		
		return praticiens ;
	}
	
	public List<Praticien> getPraticiensHesitants(){
		List<Praticien> praticiensHesitants = new ArrayList<Praticien>() ;
		
		return praticiensHesitants ;
	}
}
