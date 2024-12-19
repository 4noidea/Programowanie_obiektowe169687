public class Platnosc {
    private double kwota;
    private String statusPlatnosci; // "Nieopłacone" lub "Opłacone"

    // Konstruktor
    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone"; // Domyślnie
    }

    // Zmiana statusu na "Opłacone"
    public void zaplac() {
        if (!statusPlatnosci.equals("Opłacone")) {
            statusPlatnosci = "Opłacone";
            System.out.println("Płatność została dokonana na kwotę: " + kwota);
        }
    }

    // Gettery
    public double getKwota() {
        return kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
