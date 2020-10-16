import java.util.HashMap;

public class Bibliotheque2 {

	private Livre[] liste;
	int i;
	
	Bibliotheque2() 
	{
		 this.liste = new Livre[100];
	}

	void ajouterLivre(String nom) {
		Livre l= new Livre(nom);
		if(i<100)
		liste[i]=l;
		i++;
	
	}
		
	


	boolean emprunterLivre(String nom){
		boolean trouver =false;
		int k;
		for(int i=0; i<=liste.length; i++) { 
//			liste[i]=l;
		}
		return false;
	
	}
		

	boolean rendreLivre(String nom) {
		/*Livre l =liste.get(nom);
		if(l!=null) {
			l.rendre();	
			return true;
		}
		else {
			return false;
		}*/
		return true;
	}

	


	@Override
	public String toString() {
		return "Bibliotheque [liste=" + liste + "]";
	}
	



}
