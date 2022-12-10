public class KontoDemo {
    public static void main(String[] args) {
        Konto jgk = new JugendGiroKonto("Adolf", 2500, 1000);
        jgk.einzahlen(2000);
        jgk.auszahlen(100);
        jgk.auszahlen(500);
        jgk.auszahlen(500);
        jgk.auszahlen(1000);
        jgk.auszahlen(1000);
        jgk.auszahlen(1000);
        jgk.auszahlen(24);
        System.out.println();
        GiroKonto gk = (GiroKonto) jgk;
        gk.einzahlen(2000);
        gk.auszahlen(1000);
        gk.auszahlen(500);
        gk.auszahlen(7);

    }


}
