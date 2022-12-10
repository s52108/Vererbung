public class JugendGiroKonto extends GiroKonto {
    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    public void auszahlen(double wert) {
        if (wert <= buchungslimit) {
            if (getKontostand() - wert >= getLimit()) {
                setKontostand(getKontostand() - wert);
            } else System.out.println("Transaktion nicht möglich, Limit " + getLimit() + "erreicht");
        } else System.out.println("Transaktion nicht möglich, Buchungslimit " + buchungslimit + " überschritten");
    }
}
