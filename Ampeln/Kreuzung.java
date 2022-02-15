package Ampeln;

import static Ampeln.Steuerung.sleep;

public class Kreuzung {
    private final Ampel[] ampeln = new Ampel[4];
    private int current_light;

    public Kreuzung() {
        for (int i = 0; i < 4; i++) {
            ampeln[i] = new Ampel(3);
        }
    }

    public void next_light() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Diese Ampel " + current_light);
            ampeln[current_light].next();
        }
        sleep(2000);

        if (!(current_light + 1 > 3)) {
            current_light++;
        }
        else {
            current_light = 0;
        }

    }


}
