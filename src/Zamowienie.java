import java.util.ArrayList;
public class Zamowienie {


    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;

    private static int kolejnyNumer = 1;


    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = pobierzKolejnyNumer();
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }
    public static int pobierzKolejnyNumer() {
        int obecnyNumer = kolejnyNumer;
        kolejnyNumer++;
        return obecnyNumer;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0;
        for (ProduktMenu produkt : produkty) {
            suma += produkt.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    @Override
    public String toString() {
        String status = oplacone ? "OPŁACONE" : "DO ZAPŁATY";

        StringBuilder paragon = new StringBuilder();
        paragon.append("\n--- ZAMÓWIENIE NR ").append(numerZamowienia).append(" ---\n");
        paragon.append("Klient: ").append(klient.getPelneDaneKlienta()).append("\n");
        paragon.append("Produkty:\n");

        for (ProduktMenu produkt : produkty) {
            paragon.append(" - ").append(produkt.getNazwa())
                    .append(" (").append(produkt.getCena()).append(" zł)\n");
        }

        paragon.append("Status: ").append(status).append("\n");
        paragon.append("Suma do zapłaty: ").append(policzWartosc()).append(" zł\n");
        paragon.append("-----------------------");

        return paragon.toString();
    }
}
