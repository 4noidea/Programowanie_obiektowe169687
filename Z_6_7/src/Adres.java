public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania; // Opcjonalne
    private String miasto;
    private String kodPocztowy;

    // Konstruktor z numerem mieszkania
    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    // Konstruktor bez numeru mieszkania
    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this(ulica, numerDomu, null, miasto, kodPocztowy);
    }

    // Metoda wyświetlająca adres
    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu + (numerMieszkania != null ? "/" + numerMieszkania : ""));
    }

    // Porównywanie adresów na podstawie kodu pocztowego
    public boolean przed(Adres innyAdres) {
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }

    // Gettery i settery
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica == null || ulica.isEmpty()) {
            throw new IllegalArgumentException("Ulica nie może być pusta.");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (numerDomu == null || numerDomu.isEmpty()) {
            throw new IllegalArgumentException("Numer domu nie może być pusty.");
        }
        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.isEmpty()) {
            throw new IllegalArgumentException("Miasto nie może być puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.isEmpty()) {
            throw new IllegalArgumentException("Kod pocztowy nie może być pusty.");
        }
        this.kodPocztowy = kodPocztowy;
    }

    // Nadpisanie metody toString
    @Override
    public String toString() {
        return kodPocztowy + " " + miasto + ", " + ulica + " " + numerDomu + (numerMieszkania != null ? "/" + numerMieszkania : "");
    }
}
