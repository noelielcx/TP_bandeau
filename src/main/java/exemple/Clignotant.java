package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet {
    public Clignotant(String message, int repets, Bandeau bandeau) {
        super(message, repets, bandeau);
    }

    @Override
    public void afficher() {
        bandeau.setMessage(message);
        for (int i = 0; i < this.repets; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0) {
                    this.bandeau.setForeground(Color.red);
                    this.bandeau.sleep(100);
                }
                if ((j % 2) != 0) {
                    this.bandeau.setForeground(Color.green);
                    this.bandeau.sleep(100);

                }
            }
        }

    }
}
