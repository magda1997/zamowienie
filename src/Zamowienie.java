import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda on 04.08.2017.
 */

public class Zamowienie {
    private int ileDodanych;
    //jak nie przypiszesz tego 0 jawnie, to i tak ta zmienna przyjmie wartosc 0
    //bezsensu jest to przypisywac na sztywno
    private int maksRozmiar = 0;
    private double wartosc;
    //nie inicializuj tutaj listy, zrob to w konstruktorze
    private List<Pozycja> listaZamowien = new ArrayList<>();
    private double cenaZrabatem;

    public Zamowienie() {
        this.maksRozmiar = maksRozmiar;
    }
    // ZROB TAK ZEBY UZYTKOWNIK MOGL OKRESLIC ILE MOZE DODAC MAKSYMALNIE poZYCJI DO ZAMOWIENIA :)
    public Zamowienie(int maksRozmiar, List<Pozycja> listaZamowien) {
        this.maksRozmiar = maksRozmiar;
        this.listaZamowien = listaZamowien;
    }

    void dodajPozycje(Pozycja p) {
        listaZamowien.add(p);
    }

    void usunPozycje(Pozycja p) {
        listaZamowien.remove(p);
    }

    void wyswetlListeZamowien() {
        //ZMIEN TEN OBJECT
        for (Object i : listaZamowien) {
            System.out.println(i);
        }
    }

    public void obliczWartoscPozycjiZaowienia() {
        for (int j = 0; j < listaZamowien.size(); j++) {
            if (listaZamowien.get(j) != null) {
                wartosc = listaZamowien.get(j).getCena() * listaZamowien.get(j).getIleSztuk();
                listaZamowien.get(j).setWartosc(wartosc);
                System.out.println(wartosc);
            }
        }
    }

    public void obliczWartoscZrabatem() {
        for (int i = 0; i < listaZamowien.size(); i++) {
            if (listaZamowien.get(i)!=null) {
                if (listaZamowien.get(i).getIleSztuk() >= 5 && listaZamowien.get(i).getIleSztuk() < 10) {
                    cenaZrabatem = 0.95 * listaZamowien.get(i).getWartosc();
                    listaZamowien.get(i).setCenaZRabatem(cenaZrabatem);
                    System.out.println(" " + cenaZrabatem);
                }
                if (listaZamowien.get(i).getIleSztuk() >= 10 && listaZamowien.get(i).getIleSztuk() <= 20) {

                    cenaZrabatem = 0.9 * listaZamowien.get(i).getWartosc();
                    listaZamowien.get(i).setCenaZRabatem(cenaZrabatem);
                    System.out.println(" " + cenaZrabatem);

                }
                if (listaZamowien.get(i).getIleSztuk() > 20) {
                    cenaZrabatem = 0.85 * listaZamowien.get(i).getWartosc();
                    listaZamowien.get(i).setCenaZRabatem(cenaZrabatem);
                    System.out.println(" " + cenaZrabatem);
                }
                if (listaZamowien.get(i).getIleSztuk() < 5 && listaZamowien.get(i).getIleSztuk() >= 0) {

                    cenaZrabatem = listaZamowien.get(i).getWartosc();
                    listaZamowien.get(i).setCenaZRabatem(cenaZrabatem);
                    System.out.println(" " + cenaZrabatem);
                }
            }
        }
    }

    public int getIleDodanych() {
        return ileDodanych;
    }

    public void setIleDodanych(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }

    public int getMaksRozmiar() {
        return maksRozmiar;
    }

    public void setMaksRozmiar(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public List<Pozycja> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(List<Pozycja> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }

    public double getCenaZrabatem() {
        return cenaZrabatem;
    }

    public void setCenaZrabatem(double cenaZrabatem) {
        this.cenaZrabatem = cenaZrabatem;
    }
}

