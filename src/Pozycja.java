import java.util.Objects;

/**
 * Created by Magda on 04.08.2017.
 */
public class Pozycja {

    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;
    private double wartosc = 0;
    private double cenaZRabatem;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public void obliczWartosc() {
        wartosc = cena * ileSztuk;
        setWartosc(wartosc);
        System.out.print(wartosc);
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public double getCenaZRabatem() {
        return cenaZRabatem;
    }

    public void setCenaZRabatem(double cenaZRabatem) {
        this.cenaZRabatem = cenaZRabatem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pozycja)) return false;
        Pozycja pozycja = (Pozycja) o;
        return ileSztuk == pozycja.ileSztuk &&
                Double.compare(pozycja.cena, cena) == 0 &&
                Double.compare(pozycja.wartosc, wartosc) == 0 &&
                Double.compare(pozycja.cenaZRabatem, cenaZRabatem) == 0 &&
                Objects.equals(nazwaTowaru, pozycja.nazwaTowaru);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaTowaru, ileSztuk, cena, wartosc, cenaZRabatem);
    }


    @Override
    public String toString() {
        return "Pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", ileSztuk=" + ileSztuk +
                ", cena=" + cena +
                ", wartosc=" + wartosc +
                ", cenaZRabatem=" + cenaZRabatem +
                '}';
    }
}
