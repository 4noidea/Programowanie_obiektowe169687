public class Main {
    public static void main(String[] args) {
        // Tworzenie magazynu
        Magazyn magazyn = new Magazyn();

        // Dodawanie produktów do magazynu
        Produkt laptop = new Produkt("Laptop", 3500.0, 10);
        Produkt telefon = new Produkt("Telefon", 2000.0, 20);
        magazyn.dodajProdukt(laptop, 10);
        magazyn.dodajProdukt(telefon, 20);

        // Tworzenie sklepu
        Sklep sklep = new Sklep("TechWorld", "2005-04-15", magazyn);

        // Wyświetlenie oferty sklepu
        sklep.wyswietlOferty();

        // Tworzenie adresu klienta
        Adres adres = new Adres("Główna", "12", "34", "Warszawa", "00-001");

        // Tworzenie klienta
        Klient klient = new Klient("Jan", "Kowalski", adres);

        // Tworzenie koszyka zakupowego
        KoszykZakupowy koszyk = new KoszykZakupowy();

        // Dodawanie produktów do koszyka
        System.out.println("\nDodawanie produktów do koszyka...");
        magazyn.pobierzProdukt(laptop, 2);
        koszyk.dodajProdukt(laptop, 2);

        magazyn.pobierzProdukt(telefon, 3);
        koszyk.dodajProdukt(telefon, 3);

        // Wyświetlenie zawartości koszyka
        System.out.println("\nZawartość koszyka:");
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Całkowita wartość koszyka: " + koszyk.obliczCalkowitaWartosc());

        // Tworzenie zamówienia
        Zamowienie zamowienie = new Zamowienie(koszyk);

        // Dodawanie zamówienia do historii klienta
        klient.dodajZamowienie(zamowienie);

        // Opłacenie zamówienia
        zamowienie.getPlatnosc().zaplac();

        // Finalizacja zamówienia
        zamowienie.finalizujZamowienie();

        // Wyświetlenie zamówienia
        System.out.println("\nZamówienie klienta:");
        zamowienie.wyswietlZamowienie();

        // Wyświetlenie historii zamówień klienta
        System.out.println("\nHistoria zamówień klienta:");
        klient.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamówień: " + klient.obliczLacznyKosztZamowien());

        // Wyświetlenie oferty sklepu po zakupach
        System.out.println("\nOferta sklepu po zakupach:");
        sklep.wyswietlOferty();
    }
}
