import java.util.Objects;
public class Renifer
{
    private String imie;
    private int predkosc;

    Renifer(String imie, int predkosc)
    {
        this.imie = imie;
        this.predkosc = predkosc;
    }
    private void nakarmRenifera(int predkosc)
    {
        predkosc = predkosc+5;
    }

    @Override
    public String toString()
    {
        return imie + " " + predkosc;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Renifer renifer = (Renifer) obj;
        return predkosc == renifer.predkosc;
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }
}

