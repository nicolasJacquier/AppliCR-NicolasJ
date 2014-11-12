package applicr;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Modele {
	
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	private Connection connexion = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt= null;
	
	public Modele() throws ClassNotFoundException{
		
		connexionBDD();
		
	}
	
	public void connexionBDD() throws ClassNotFoundException {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    String url = "jdbc:mysql://localhost/GsbCRSlam";
		    connexion = DriverManager.getConnection(url, "root", "mysql");
		    selectPraticiensH();
	    }
		catch (SQLException ex){
			
			System.err.println(ex.getMessage());
			
		}
	}
	
	
	 public void selectPraticiensH() {
		  System.out.println("Affichage des Praticiens Hesitants :");
		  String query = "SELECT PRA_NOM, PRA_VILLE, PRA_COEFCONFIANCE, PRA_COEFNOTORIETE FROM PRATICIEN ";
		  		
		  		//+ "WHERE PRA_ESTHESITANT = True";
		  try {
			  Statement st = connexion.createStatement();
			  ResultSet rs = st.executeQuery(query);
			
			  while (rs.next()) {
				  String nom = rs.getString("PRA_NOM");
				  String ville = rs.getString("PRA_VILLE") ;
				  int coefC = rs.getInt("PRA_COEFCONFIANCE") ;
				  int coefN = rs.getInt("PRA_COEFNOTORIETE");
				  this.praticiens.add(new Praticien(nom,ville,coefC,coefN)) ;
				 
				  }
		  }
		  catch (SQLException ex) {System.err.println(ex.getMessage());}
	}
	 
	 
	 
	public List<Praticien> getPraticiens() {
		System.out.println("AccesModele::getPraticiens()") ;
		return this.praticiens;
	}
	
	
}
