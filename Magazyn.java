import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    private Map<Produkt, Integer> produkty; // Mapa produktu i jego ilości

    // Konstruktor
    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    // Dodawanie produktu do magazynu
    public void dodajProdukt(Produkt produkt, int ilosc) {
        produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
        System.out.println("Dodano " + ilosc + " sztuk produktu " + produkt.getNazwa() + " do magazynu.");
    }

    // Wyświetlanie asortymentu magazynu
    public void wyswietlAsortyment() {
        System.out.println("Asortyment magazynu:");
        for (Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey().toString() + ", Ilość: " + entry.getValue());
        }
    }

    // Pobieranie produktu z magazynu
    public boolean pobierzProdukt(Produkt produkt, int ilosc) {
        if (produkty.containsKey(produkt) && produkty.get(produkt) >= ilosc) {
            produkty.put(produkt, produkty.get(produkt) - ilosc);
            if (produkty.get(produkt) == 0) {
                produkty.remove(produkt);
            }
            System.out.println("Pobrano " + ilosc + " sztuk produktu " + produkt.getNazwa() + " z magazynu.");
            return true;
        } else {
            System.out.println("Niewystarczająca ilość produktu " + produkt.getNazwa() + " w magazynie.");
            return false;
        }
    }
}
