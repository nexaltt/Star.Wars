package galaxieTheatre;
/*
@Author Yanis
@ Projet : StarWars
*/
public class Paire<X, Y> {

    private X elementPremier;
    private Y elementSecond;

    public Paire(X elementPremier, Y elementSecond) {
        this.elementPremier = elementPremier;
        this.elementSecond = elementSecond;
    }

    public X getElementPremier() {
        return elementPremier;
    }

    public void setElementPremier(X elementPremier) {
        this.elementPremier = elementPremier;
    }

    public Y getElementSecond() {
        return elementSecond;
    }

    public void setElementSecond(Y elementSecond) {
        this.elementSecond = elementSecond;
    }

    @Override
    public String toString() {
        return "Paire{" +
                elementPremier.getClass().getSimpleName() + " : " + elementPremier + " " +
                elementSecond.getClass().getSimpleName() + " : " + elementSecond +
                '}';
    }
}