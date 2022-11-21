package exemple;
import bandeau.Bandeau;


public abstract class Effet {

    public String message;
    public int repets;
    public Bandeau bandeau;

    public Effet (String message, int repets, Bandeau bandeau){
        this.message = message;
        this.repets = repets;
        this.bandeau = bandeau;
    }

    public abstract void afficher();

}
