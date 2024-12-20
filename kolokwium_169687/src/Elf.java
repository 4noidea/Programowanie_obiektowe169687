import java.time.LocalDate;
import java.util.Objects;
public class Elf
{
    static private String imie;
    static private String nazwisko;
    private int wiek;
    private String Stanowisko;

    private Elf(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.Stanowisko = "";
    }

    private void przedstawSie(String imie, String nazwisko, int wiek, String Stanowisko)
    {
        System.out.println("Czesc, nazywam sie"+imie+", mam"+wiek+",lat,a moje stanowisko pracy to"+Stanowisko);
    }
    @Override
    public String toString()
    {
        return imie + " " + nazwisko;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elf elf = (Elf) obj;
        return imie.equals(Elf.imie) &&
                nazwisko.equals(Elf.nazwisko);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(imie, nazwisko,wiek,Stanowisko);
    }

    @Override
    public String getString()
    {
        return imie + " " + nazwisko;
    }

}
