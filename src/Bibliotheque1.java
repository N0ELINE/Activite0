import java.util.HashMap;

public class Bibliotheque1 implements Bibliotheque {

	private HashMap<String, Media> liste;

	public void ajouter(String nom) {
		Livre l= new Livre(nom);
		liste.put(nom, l);	
	}


	public boolean emprunter(String nom){
		Livre l =liste.get(nom);
		
		if(l!=null) {
			boolean condition = l.emprunter();
			return condition;
		}
		else {
			return false;
		}
	}

	public boolean rendre(String nom) {
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


	@Override
	public void ajouter(String nom, MediaEnum mediaEnum) {
		Media media = null ;
		if (MediaEnum.LIVRE == mediaEnum) media = new Livre(nom);
		if (MediaEnum.DVD == mediaEnum) media = new Dvd(nom);
		liste.put(nom, media);
		
	}
	



}
