package galaxieCinema;
import java.util.List;
/*
@Author Yanis
@ Projet : StarWars
*/
public class Comedien {
	private String nomArtiste;
	private String prenomArtiste;
	private Paire<Role, Role> duoRoles;

	private  List<Role> rolesInterpretes;

///constructeurs

	public Comedien() {}

	public Comedien(String nom, String prenom, Paire<Role,Role> roles) {
		super();
		this.nomArtiste = nom;
		this.prenomArtiste = prenom;
		this.duoRoles = roles;
	}

	public Comedien(String nom, String prenom) {

		this.nomArtiste = nom;
		this.prenomArtiste = prenom;
	}


	public Paire<Role,Role> getDuoRoles() {
		return duoRoles;
	}

	public void setDuoRoles(Paire<Role,Role> duoRoles) {
		this.duoRoles = duoRoles;
	}

	public String getNomArtiste() {
		return nomArtiste;
	}
	public void setNomArtiste(String nom) {
		this.nomArtiste = nom;
	}
	public String getPrenomArtiste() {
		return prenomArtiste;
	}
	public void setPrenomArtiste(String prenom) {
		this.prenomArtiste = prenom;
	}

	public List<Role> getRolesInterpretes() {
		return rolesInterpretes;
	}

	public void setRolesInterpretes(List<Role> rolesInterpretes) {
		this.rolesInterpretes = rolesInterpretes;
	}
	public String toString() {
		return"class : "+ getClass().getSimpleName()+
				"\n Nom Artiste :"+ this.nomArtiste +
				"\n Prenom Artiste :"+ this.prenomArtiste+
				"\n Roles Interpretes :"+ this.duoRoles;
	}

	/**
	 * Retourne le nombre de rôles interprétés par un comédien
	 * @return le nombre de rôles
	 **/

	public int nbRoles() {return this.rolesInterpretes.size();}

}
