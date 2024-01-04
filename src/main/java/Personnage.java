package starwars;

public class Personnage{
	private String Nom;
	private String Prenom;
	
	public Personnage(){	
	}
	
	public Personnage(String Nom, String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public String toString() {
        return "Classe : " + getClass().getSimpleName() +
        		"\nNom : " + Nom +
        		"\nPrenom : " + Prenom ;
    }

	
}