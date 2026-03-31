public class Main {

    public static void main(String[] args) {

        ProduktMenu kawa = new ProduktMenu("K1", "Latte Macchiato", 15.50, "Kawy");
        ProduktMenu herbata = new ProduktMenu("H1", "Herbata Zimowa", 12.00, "Herbaty");
        ProduktMenu ciasto = new ProduktMenu("D1", "Sernik", 18.00, "Desery");

        ProduktMenu kawaKopia = new ProduktMenu("K1", "Latte na owsiaku", 17.00, "Kawy");

        KlientKawiarni klient = new KlientKawiarni(101, "Ola", "Kowalska", "ola@mail.com");

        Zamowienie zamowienieOli = new Zamowienie(klient);
        zamowienieOli.dodajProdukt(kawa);
        zamowienieOli.dodajProdukt(ciasto);

        zamowienieOli.oznaczJakoOplacone();

        System.out.println(zamowienieOli);

        System.out.println("\nLiczba rodzajów produktów w menu kawiarni: " + ProduktMenu.getLiczbaProduktow());

        System.out.println("\n--- TEST METODY equals() ---");

        System.out.println("Czy 'kawa' i 'ciasto' to ten sam produkt? " + kawa.equals(ciasto));

        System.out.println("Czy 'kawa' i 'kawaKopia' to ten sam produkt? " + kawa.equals(kawaKopia));
    }
}