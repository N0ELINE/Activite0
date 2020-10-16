import java.util.HashMap;

public class Bibliotheque1 {

	HashMap<String, Livre> liste;

	void ajouterLivre(String nom) {
		Livre l= new Livre(nom);
		liste.put(nom, l);	
	}


	boolean emprunterLivre(String nom){
		Livre l =liste.get(nom);
		
		if(l!=null) {
			boolean condition = l.emprunter();
			return condition;
		}
		else {
			return false;
		}
	}

	boolean rendreLivre(String nom) {
		Livre l =liste.get(nom);
		if(l!=null) {
			l.rendre();	
			return true;
		}
		else {
			return false;
		}
	}

	Bibliotheque1() {
		liste = new HashMap<String, Livre>();

	}


	@Override
	public String toString() {
		return "Bibliotheque [liste=" + liste + "]";
	}
	



}
