import java.util.Objects;

public class KlientKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getPelneDaneKlienta() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    @Override
    public String toString() {
        return "Klient ID: " + idKlienta + ", " + getPelneDaneKlienta();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlientKawiarni that = (KlientKawiarni) o;

        return idKlienta == that.idKlienta || Objects.equals(email, that.email);
    }
}