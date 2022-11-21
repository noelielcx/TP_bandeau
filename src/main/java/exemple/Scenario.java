package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {

    public Bandeau b;
    public ArrayList<Effet> lesEffets = new ArrayList<>();

    public Scenario(Bandeau b){
        this.b = b;
    }

    public void ajouterEffets(Effet lesEffets){
        this.lesEffets.add(lesEffets);
    }

    public void afficherScenario(){
        for (Effet e: lesEffets){
            e.afficher();
            b.sleep(1000);
        }
        b.close();
    }
}
