package Ampeln;

public class Steuerung {
    public static void sleep(int ms) {
        long start = System.currentTimeMillis();

        while (true) {
            if (System.currentTimeMillis() - start > ms) { return; }
        }
    }

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
