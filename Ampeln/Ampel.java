package Ampeln;

import static Ampeln.Steuerung.sleep;

public class Ampel {
    private final Leuchte[] leuchten;
    private int phase;

    public Ampel(int anzahl_leuchten) {
        leuchten = new Leuchte[anzahl_leuchten];
        for (int i = 0; i < anzahl_leuchten; i++) {
            leuchten[i] = new Leuchte(i);
        }
    }

    public void next() {
        switch (phase) {
            case 0:
                System.out.println("Diese Lampe ist nun rot.");
                leuchten[0].switch_power();
                leuchten[1].switch_power();
                sleep(1500);
                break;
            case 1:
                System.out.println("Diese Lampe ist nun rot gelb.");
                leuchten[1].switch_power();
                sleep(1500);
                break;
            case 2:
                System.out.println("Diese Lampe ist nun gruen..");
                leuchten[0].switch_power();
                leuchten[1].switch_power();
                leuchten[2].switch_power();
                sleep(10000);
                break;
            case 3:
                System.out.println("Diese Lampe ist nun gelb.");
                leuchten[2].switch_power();
                leuchten[1].switch_power();
                sleep(1500);
                leuchten[0].switch_power();
                break;
        }

        if (!(phase + 1 > 3)) {
            phase++;
            return;
        }
        phase = 0;
    }
}
