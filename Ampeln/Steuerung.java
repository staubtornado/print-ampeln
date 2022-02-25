package Ampeln;

/**
 * @author Julian Kirchner; Jannis Dickel
 */

public class Steuerung {

    /**
     * @author Julian Kirchner
     * @param ms Millisekunden, welche die Funktion warten soll.
     */
    public static void sleep(int ms) {
        long start = System.currentTimeMillis();

        while (true) {
            if (System.currentTimeMillis() - start > ms) { return; }
        }
    }

    /**
     * @author Julian Kirchner
     */
    public static void main(String[] args) {
        Kreuzung kreuzung = new Kreuzung();

        while (true) {
            try {
            kreuzung.next_light();
            }
            catch (Exception e) {
                System.out.print("Die Ampel wurde beendet.");
                break;
            }
        }
    }
}
