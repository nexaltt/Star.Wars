package starwars;

public class PersoGentil extends Personnage{
	private Boolean Force;

	
	public PersoGentil(Boolean Force) {
		super();
        this.Force = Force;
    }
	public Boolean getForce() {
		return Force;
	}
	public void setForce(Boolean force) {
		Force = force;
	}
	public String toString() {
		return "PersoGentil"+super.toString()+" [Force=" + Force + "]";
	}
}