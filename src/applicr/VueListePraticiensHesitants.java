package applicr;




import javax.swing.JPanel;

public class VueListePraticiensHesitants extends JPanel {
	
	private Controleur controleur ;
	private ModeleAppliCR modele ;
	
	public VueListePraticiensHesitants(ModeleAppliCR modele, Controleur controleur) {
		super();
		this.controleur = controleur;
		this.modele = modele;
	}

	public Controleur getControleur() {
		return controleur;
	}

	public void setControleur(Controleur controleur) {
		this.controleur = controleur;
	}

	public ModeleAppliCR getModele() {
		return modele;
	}

	public void setModele(ModeleAppliCR modele) {
		this.modele = modele;
	}
	
	public void actualier(){
		
	}

}
