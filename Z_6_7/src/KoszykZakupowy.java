import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();

    // Metoda dodająca produkt do koszyka
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.usunZMagazynu(ilosc)) {
            for (int i = 0; i < ilosc; i++) {
                produkty.add(produkt);
            }
            System.out.println(ilosc + " sztuk produktu " + produkt.getNazwa() + " dodano do koszyka.");
        }
    }

    // Wyświetlanie zawartości koszyka
    public void wyswietlZawartoscKoszyka() {
        System.out.println("Zawartość koszyka:");
        produkty.forEach(produkt -> produkt.wyswietlInformacje());
    }

    // Obliczanie całkowitej wartości koszyka
    public double obliczCalkowitaWartosc() {
        double wartosc = 0;
        for (Produkt produkt : produkty) {
            wartosc += produkt.getCena();
        }
        return wartosc;
    }
}
