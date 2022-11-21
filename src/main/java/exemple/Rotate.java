package exemple;
import bandeau.Bandeau;

import java.awt.*;


public class Rotate extends Effet{

    public Rotate(String message, int repets, Bandeau bandeau){
        super(message, repets, bandeau);
    }

    @Override
    public void afficher() {
        bandeau.setMessage(message);
        for (int i = 0 ; i <this.repets; i++){
            for (int j = 0; j <= 100; j++){
                this.bandeau.setForeground(Color.blue);
                this.bandeau.setRotation(2 * Math.PI * j / 100);
                this.bandeau.sleep(20);
            }
        }
    }
}
