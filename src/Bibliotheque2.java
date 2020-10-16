import java.util.Arrays;
import java.util.HashMap;

public class Bibliotheque2 implements Bibliotheque {

	private Livre[] liste;
	private int tailleTab;

	Bibliotheque2() {
		this.liste = new Livre[100];
		this.tailleTab = -1;
	}

	public void ajouter(String nom) {
		Livre l = new Livre(nom);
		if (tailleTab < 100) {
			tailleTab++;
			liste[tailleTab] = l;
		}
	}

	public boolean emprunter(String nom) {
		boolean trouver = false;
		for (int i = 0; i <= tailleTab; i++) {
			Livre l = liste[i];
			if (l.getNom().equals(nom) && l.isEmprunt()==false) {
				l.setEmprunt(true);
				trouver = true;
			}
		}
		return trouver;
	}

	public boolean rendre(String nom) {
		boolean trouver = false;
		for (int i = 0; i <= tailleTab; i++) {
			Livre l = liste[i];
			if (l.getNom().equals(nom) && l.isEmprunt()==true) {
				l.setEmprunt(false);
				trouver = true;
			}
		}
		return trouver;
	}

	@Override
	public String toString() {
		return "Bibliotheque2 [liste=" + Arrays.toString(liste) + ", tailleTab=" + tailleTab + "]";
	}

	@Override
	public void ajouter(String nom, MediaEnum mediaEnum) {
		// TODO Auto-generated method stub
		
	}
	
		
	

}
