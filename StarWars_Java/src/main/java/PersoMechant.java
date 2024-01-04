package starwars;


/* 
@Author Yanis
@Projet : StarWars
*/

public class PersoMechant extends Personnage{
	private Boolean Coteobscure;
	
	public PersoMechant(Boolean Coteobscure) {
		super();
        this.Coteobscure = Coteobscure;
    }

    
	public Boolean getCoteobscure() {
		return Coteobscure;
	}
	public void setCoteobscure(Boolean coteobscure) {
		Coteobscure = coteobscure;
	}
	@Override
	public String toString() {
		return "PersoMechant"+super.toString()+" [Coteobscure=" + Coteobscure + "]";
	}


	
	
}