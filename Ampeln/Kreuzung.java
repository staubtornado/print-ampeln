package Ampeln;

import static Ampeln.Steuerung.sleep;

/**
 * @author Julian Kirchner; Jannis Dickel
 */

public class Kreuzung {
    private final Ampel[] ampeln = new Ampel[4];
    private int current_light;

    public Kreuzung() {
        for (int i = 0; i < 4; i++) {
            ampeln[i] = new Ampel(3);
            current_light = i;
            System.out.println(this);
        }
        current_light = 0;
    }

    /**
     * @author Julian Kirchner
     */
    public void next_light() {
        for (int i = 0; i < 4; i++) {
            ampeln[current_light].next();
            System.out.println(this);
        }
        sleep(2000);

        if (!(current_light + 1 > 3)) {
            current_light++;
        }
        else {
            current_light = 0;
        }
    }

    /**
     * @author Julian Kirchner
     * @return String mit Informationen aller Lampen.
     */
    @Override
    public String toString() {
        return "Ampel " + current_light + " [" + ampeln[current_light] + "]";
    }
}
