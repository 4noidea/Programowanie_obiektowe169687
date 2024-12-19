
public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    // Konstruktor
    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    // Metoda wyświetlająca informacje o produkcie
    public void wyswietlInformacje() {
        System.out.println("Produkt: " + nazwa + ", Cena: " + cena + ", Ilość na magazynie: " + iloscNaMagazynie);
    }

    // Metoda zwiększająca ilość na magazynie
    public void dodajDoMagazynu(int ilosc) {
        this.iloscNaMagazynie += ilosc;
        System.out.println(ilosc + " sztuk dodano do magazynu.");
    }

    // Metoda zmniejszająca ilość na magazynie
    public boolean usunZMagazynu(int ilosc) {
        if (ilosc <= iloscNaMagazynie) {
            this.iloscNaMagazynie -= ilosc;
            System.out.println(ilosc + " sztuk usunięto z magazynu.");
            return true;
        } else {
            System.out.println("Niewystarczająca ilość na magazynie!");
            return false;
        }
    }

    // Gettery
    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }
}
