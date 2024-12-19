import java.time.LocalDate;
import java.util.Objects;

public class Sklep {
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    // Konstruktor
    public Sklep(String nazwaSklepu, String dataPowstania, Magazyn magazynSklepu) {
        setNazwaSklepu(nazwaSklepu);
        setDataPowstania(dataPowstania);
        setMagazynSklepu(magazynSklepu);
    }

    // Gettery i Settery z walidacją
    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if (nazwaSklepu == null || nazwaSklepu.isEmpty()) {
            throw new IllegalArgumentException("Nazwa sklepu nie może być pusta.");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(String dataPowstania) {
        LocalDate parsedDate = LocalDate.parse(dataPowstania);
        if (parsedDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data powstania nie może być z przyszłości.");
        }
        this.dataPowstania = parsedDate;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if (magazynSklepu == null) {
            throw new IllegalArgumentException("Magazyn sklepu nie może być null.");
        }
        this.magazynSklepu = magazynSklepu;
    }

    // Wyświetlanie oferty sklepu (zawartość magazynu)
    public void wyswietlOferty() {
        System.out.println("Oferta sklepu \"" + nazwaSklepu + "\":");
        magazynSklepu.wyswietlAsortyment();
    }

    // Nadpisanie metody toString
    @Override
    public String toString() {
        return "Sklep{" +
                "nazwaSklepu='" + nazwaSklepu + '\'' +
                ", dataPowstania=" + dataPowstania +
                '}';
    }

    // Nadpisanie metody equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sklep sklep = (Sklep) obj;
        return nazwaSklepu.equals(sklep.nazwaSklepu) &&
                dataPowstania.equals(sklep.dataPowstania);
    }

    // Nadpisanie metody hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nazwaSklepu, dataPowstania);
    }
}
