package applicr;

import java.sql.* ;

public class ConnexionBD {
	private static final String dbURL = "jdbc:mysql://localhost/gsb?useUnicode=yes&characterEncoding=UTF-8" ;
	private static final String user = "root" ;
	private static final String password = "azerty" ;
	private static Connection connexion = null ;
	
	private ConnexionBD() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver") ;
		connexion = DriverManager.getConnection(dbURL,user,password) ;
	}
	
	public static Connection getConnexion() throws ClassNotFoundException, SQLException{
		if(connexion == null){
			new ConnexionBD() ;
		}
		return connexion ;
	}
}
