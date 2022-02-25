package Ampeln;

/**
 * @author Julian Kirchner, Jannis Dickel
 */
public class Leuchte {
    private final String farbe;
    private boolean status;

    public Leuchte(int farbe) {
        String[] colors = {"\u001B[31mrot\u001B[0m", "\u001B[33mgelb\u001B[0m", "\u001B[32mgruen\u001B[0m"};
        status = false;
        this.farbe = colors[farbe];

        if (farbe == 0) {
            status = true;
        }
    }

    /**
     * @author Jannis Dickel
     */
    public void on() {
        status = true;
    }

    /**
     * @author Jannis Dickel
     */
    public void off() {
        status = false;
    }

    /**
     * @author Julian Kirchner
     * @return String welcher nur die Informationen der aktuellen Leuchte formatiert zurückgibt.
     */
    @Override
    public String toString() {
        String status = "false";

        if (this.status) {
            status = "\u001B[36mtrue\u001B[0m";
        }
        return "Leuchte [" + farbe + ", an=" + status + "]";
    }

}
