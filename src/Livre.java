
public class Livre {
	
	private String nom;
	private boolean emprunt;
	
	
	boolean emprunter() {
		if(emprunt==false) {
			emprunt=true;
			return true;
		}
		else {
			return false;
		}	
	}
	
	boolean rendre() {
		if(emprunt==false) {
			return false;
		}
		else {
			return true;
		}
	}

	Livre (String nom) {
		this.nom = nom;
		this.emprunt = false;
	}

	@Override
	public String toString() {
		return "Livre [nom=" + nom + ", emprunt=" + emprunt + "]";
	}

	public String getNom() {
		return nom;
	}
	
	

	public void setEmprunt(boolean emprunt) {
		this.emprunt = emprunt;
	}

	public boolean isEmprunt() {
		return emprunt;
	}

	
	
	
	
	
	
	

}
