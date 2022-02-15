package Ampeln;

public class Leuchte {
    private final int farbe;
    private boolean status;

    public Leuchte(int farbe) {
        status = false;
        this.farbe = farbe;
    }

    public void switch_power() {
        this.status = !(status);
    }
}
