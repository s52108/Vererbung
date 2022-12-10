public class SparKonto extends Konto {
    public SparKonto(String inhaber) {
        super(inhaber);
    }

    public void auszahlen(double wert) {
        if (getKontostand() - wert > 0) {
            setKontostand(getKontostand() - wert);
        } else System.out.println("Transaktion nicht möglich, ihr Kontostand darf nicht negativ sein!");
    }
}
