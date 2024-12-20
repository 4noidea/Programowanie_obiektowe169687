import java.util.ArrayList;
import java.util.Objects;

public class Fabryka
{
    private ArrayList<Elf>listaElfow;
    private double dlGeo;
    private double szGeo2;

    private Fabryka(ArrayList<Elf>listaElfow, double dlGeo, double szGeo2)
    {
        this.listaElfow = listaElfow;
        this.dlGeo = dlGeo;
        this.szGeo2 = szGeo2;
    }

    private void dodajPracownika(Elf elf)
    {
        listaElfow.add(elf);
    }
    private void usunPracownika(Elf elf)
    {
        listaElfow.remove(elf);
    }
    private Elf najstarszyPracownik(Elf elf,Elf wiek)
    {
        Elf najstarszy;
        for(int i=0;i<listaElfow.size();i++)
        {
            if(listaElfow.get(i).equals(elf))
            {
                najstarszy = listaElfow.get(i);
            }

        }
        return najstarszy;
    }
    @Override
    public String toString()
    {
        return "Fabryka [listaElfow=" + listaElfow + "]";
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fabryka fabryka = (Fabryka) obj;
        return listaElfow.equals(fabryka.listaElfow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listaElfow, dlGeo, szGeo2);
    }



}
