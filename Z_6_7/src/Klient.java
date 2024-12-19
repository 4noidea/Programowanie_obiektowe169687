import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres; // Nowe pole - adres klienta
    private ArrayList<Zamowienie> listaZamowien;

    // Konstruktor
    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
        this.listaZamowien = new ArrayList<>();
    }

    // Dodanie zamówienia do listy
    public void dodajZamowienie(Zamowienie zamowienie) {
        if (zamowienie == null) {
            throw new IllegalArgumentException("Zamówienie nie może być null.");
        }
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamówienie do historii zamówień klienta: " + imie + " " + nazwisko);
    }

    // Wyświetlenie historii zamówień
    public void wyswietlHistorieZamowien() {
        System.out.println("Historia zamówień klienta " + imie + " " + nazwisko + ":");
        for (Zamowienie zamowienie : listaZamowien) {
            zamowienie.wyswietlZamowienie();
            System.out.println("----------");
        }
    }

    // Obliczenie łącznego kosztu wszystkich zamówień
    public double obliczLacznyKosztZamowien() {
        double lacznyKoszt = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            lacznyKoszt += zamowienie.getPlatnosc().getKwota();
        }
        return lacznyKoszt;
    }

    // Nadpisanie metody toString
    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres.toString() +
                ", liczba zamówień=" + listaZamowien.size() +
                '}';
    }

    // Nadpisanie metody equals - Klienci są równi, jeśli mają identyczne imię, nazwisko i adres
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klient klient = (Klient) obj;
        return imie.equals(klient.imie) &&
                nazwisko.equals(klient.nazwisko) &&
                adres.equals(klient.adres);
    }

    // Nadpisanie metody hashCode - wykorzystuje imię, nazwisko i adres
    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    // Gettery i Settery z walidacją

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty()) {
            throw new IllegalArgumentException("Nazwisko nie może być puste.");
        }
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return new ArrayList<>(listaZamowien); // Zwraca kopię listy zamówień
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if (listaZamowien == null) {
            throw new IllegalArgumentException("Lista zamówień nie może być null.");
        }
        this.listaZamowien = listaZamowien;
    }
}
