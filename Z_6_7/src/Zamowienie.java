public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia; // np. "W trakcie realizacji", "Gotowe do wysyłki", itp.
    private Platnosc platnosc;

    // Konstruktor
    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Nowe"; // Domyślny status zamówienia
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    // Metoda zmieniająca status zamówienia
    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
        System.out.println("Status zamówienia zmieniony na: " + status);
    }

    // Wyświetlanie zamówienia (zawartości koszyka + status zamówienia)
    public void wyswietlZamowienie() {
        System.out.println("Zamówienie:");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
    }

    // Finalizowanie zamówienia - tylko jeśli płatność jest opłacona
    public void finalizujZamowienie() {
        if (platnosc.getStatusPlatnosci().equals("Opłacone")) {
            ustawStatusZamowienia("Gotowe do wysyłki");
        } else {
            System.out.println("Nie można sfinalizować zamówienia - płatność nie została opłacona.");
        }
    }

    // Zwrot produktu do magazynu
    public void zwrocProdukt(Produkt produkt, int ilosc) {
        for (int i = 0; i < ilosc; i++) {
            koszykZakupowy.dodajProdukt(produkt, -1); // Zwraca produkt do magazynu
        }
        System.out.println(ilosc + " sztuk produktu " + produkt.getNazwa() + " zwrócono do magazynu.");
    }

    // Getter dla płatności
    public Platnosc getPlatnosc() {
        return platnosc;
    }
}

