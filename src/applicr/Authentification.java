package applicr;

import java.sql.* ;

public class Authentification {

	public static boolean seConnecter(String login, String mdp){
		
		boolean connexionOk = false ;
		
		try {
			Connection connexion = ConnexionBD.getConnexion() ;
			
		}
		catch(Exception e){
			connexionOk = false ;
		}
		return connexionOk ;
	}
	
}
