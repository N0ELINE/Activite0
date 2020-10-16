
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
		
//		Bibliotheque1 biblio = new Bibliotheque1();
		Bibliotheque biblio = BiblioFactory.getBiblio(1);
		biblio.ajouter("Java");
		boolean isEmpruntOk;
		
		// test emprunt OK livre existant
		isEmpruntOk = biblio.emprunter("Java");
		if (isEmpruntOk == true) {
			System.out.println("Emprunt livre 'Java' : Tout s'est bien passé");
		}
		// test emprunt KO déjà emprunté
		isEmpruntOk = biblio.emprunter("Java");
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Java' : KO déjà emprunté");
		}
		// test emprunt KO livre non existant
		isEmpruntOk = biblio.emprunter("Pas là");
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Pas Là' : KO pas dans la bibliothèque");
		}
		
		biblio.ajouter("Java");
		biblio.ajouter("Autre");
		System.out.println("Affichage contenu Bibliothèque avant emprunt livre 'Java' \n" + biblio);
		System.out.println("C'est bon");

		
		
		
//		Bibliotheque2 biblio2 = new Bibliotheque2();
//		biblio2.ajouterLivre("Java");
//		boolean isEmpruntOk;
//		
//		isEmpruntOk = biblio2.rendreLivre("Java");
//		if (isEmpruntOk != true) {
//			System.out.println("Emprunt livre 'Java' : peut pas rendre");
//		}
//		isEmpruntOk = biblio2.emprunterLivre("Java");
//		if (isEmpruntOk == true) {
//			System.out.println("Emprunt livre 'Java' : Tout s'est bien passé");
//		}
//		isEmpruntOk = biblio2.rendreLivre("Java");
//		if (isEmpruntOk == true) {
//			System.out.println("Emprunt livre 'Java' : on rend");
//		}
//		isEmpruntOk = biblio2.emprunterLivre("Java");
//		isEmpruntOk = biblio2.emprunterLivre("Java");
//		if (isEmpruntOk != true) {
//			System.out.println("Emprunt livre 'Java' : KO déjà emprunté");
//		}
//		isEmpruntOk = biblio2.emprunterLivre("Pas là");
//		if (isEmpruntOk != true) {
//			System.out.println("Emprunt livre 'Pas Là' : KO pas dans la bibliothèque");
//		}
//		System.out.println(biblio2.toString());
		
	}

}
