import java.util.ArrayList;
import java.util.Objects;

public class Sanie
{
    private ArrayList<Renifer>renifery;

    Sanie(ArrayList<Renifer> renifery)
    {
        this.renifery = renifery;
    }
    private void dodajRenifera(Renifer renifer)
    {
        renifery.add(renifer);
    }
    private void sumaPredkosci(ArrayList<Renifer> predkosc)
    {
        int suma=0;
        for(Renifer renifery : predkosc)
        {
            suma+=predkosc;

        }

    }
    @Override
    public String toString()
    {
        return renifery.toString();
    }
    @Override
    public boolean equals(Object obj)
    {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sanie sanie = (Sanie) obj;
        return Objects.equals(renifery, sanie.renifery);

    }
    @Override
    public int hashCode() {
        return Objects.hash(renifery);
    }

}
