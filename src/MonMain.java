
public class MonMain {

	public static void main(String[] args) {

		/*biblio.ajouterLivre("Java");
		biblio.emprunterLivre("Java");
		biblio.emprunterLivre("Jouer");
		biblio.rendreLivre("truc");*/
		/*biblio.emprunterLivre("Pas là"); patie 2
		 vous aurez une erreur
		d’exécution puisque la méthode emprunterLivre() de la classe Bibliotheque ne vérifie pas que la
		variable « l » référence réellement un Livre.*/
		
		Bibliotheque1 biblio = new Bibliotheque1();
		biblio.ajouterLivre("Java");
		boolean isEmpruntOk;
		
		// test emprunt OK livre existant
		isEmpruntOk = biblio.emprunterLivre("Java");
		if (isEmpruntOk == true) {
			System.out.println("Emprunt livre 'Java' : Tout s'est bien passé");
		}
		// test emprunt KO déjà emprunté
		isEmpruntOk = biblio.emprunterLivre("Java");
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Java' : KO déjà emprunté");
		}
		// test emprunt KO livre non existant
		isEmpruntOk = biblio.emprunterLivre("Pas là");
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Pas Là' : KO pas dans la bibliothèque");
		}
		
		biblio.ajouterLivre("Java");
		biblio.ajouterLivre("Autre");
		System.out.println("Affichage contenu Bibliothèque avant emprunt livre 'Java' \n" + biblio);
		System.out.println("C'est bon");

	}

}
