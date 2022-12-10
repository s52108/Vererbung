public class GiroKonto extends Konto {
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void auszahlen(double wert) {
        if (getKontostand() - wert <= getKontostand() + limit) {
            setKontostand(getKontostand() - wert);
        } else System.out.println("Transaktion nicht möglich, Limit " + limit + "erreicht");

    }


}
