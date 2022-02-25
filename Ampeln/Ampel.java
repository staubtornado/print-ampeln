package Ampeln;

import java.util.Arrays;

import static Ampeln.Steuerung.sleep;

/**
 * @author Julian Kirchner; Jannis Dickel
 */

public class Ampel {
    private final Leuchte[] leuchten;
    private int phase = 1;

    public Ampel(int anzahl_leuchten) {
        leuchten = new Leuchte[anzahl_leuchten];
        for (int i = 0; i < anzahl_leuchten; i++) {
            leuchten[i] = new Leuchte(i);
        }
    }

    /**
     * @author Jannis Dickel
     */
    public void next() {
        switch (phase) {
            case 0:
                leuchten[0].on();
                leuchten[1].off();
                sleep(1500);
                break;
            case 1:
                leuchten[1].on();
                sleep(1500);
                break;
            case 2:
                leuchten[0].off();
                leuchten[1].off();
                leuchten[2].on();
                sleep(1500);
                break;
            case 3:
                leuchten[2].off();
                leuchten[1].on();
                sleep(10000);
                break;
        }

        if (!(phase + 1 > 3)) {
            phase++;
            return;
        }
        phase = 0;
    }

    @Override
    public String toString() {
        return phase + ", Leuchten = [" + Arrays.toString(leuchten) + "]";
    }
}
