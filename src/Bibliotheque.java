
public interface Bibliotheque {
	@Deprecated
	public void ajouter(String nom);
	
	public boolean emprunter(String nom);
	
	public boolean rendre(String nom);
	
	public void ajouter(String nom, MediaEnum mediaEnum) ;
	
}
