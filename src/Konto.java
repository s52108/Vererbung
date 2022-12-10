public class Konto {

    private String inhaber;
    private double kontostand = 0;

    public Konto(String inhaber) {
        this.inhaber = inhaber;

    }

    public void einzahlen(double wert) {
        kontostand = kontostand + wert;
    }

    public void auszahlen(double wert) {
        kontostand = kontostand - wert;

    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKontostand() {
        return kontostand;
    }
}
