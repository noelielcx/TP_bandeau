package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{

    public Zoom(String message, int repets, Bandeau bandeau) {
        super(message, repets, bandeau);
    }

    @Override
    public void afficher() {
    bandeau.setMessage(message);
    for (int i =0; i<this.repets; i++){
        for (int j = 5; j<=60; j+=5){
            this.bandeau.setForeground(Color.pink);
            this.bandeau.setFont(new Font("Exemple", Font.ITALIC, 5+j));
            this.bandeau.sleep(80);
        }

    }
    }
}
