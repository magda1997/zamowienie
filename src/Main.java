/**
 * Created by Magda on 04.08.2017.
 */

//POPATRZ NA WSZYSTKIE KLASY CZY COS MOZNA POPRAWIC JESZCZE, WRZUC WSZYSTKIE TE ZADANIA NA GITA
public class Main {
    public static void main(String[] args){
        Pozycja pozycja = new Pozycja("chleb", 12, 3);
        Pozycja pozycja1 = new Pozycja("szynka", 1, 5);
        Pozycja pozycja2 = new Pozycja("bulka", 2, 1);
        Pozycja pozycja3 = new Pozycja("ser", 8, 7);
        Pozycja pozycja4 = new Pozycja("mleko", 1, 2);

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajPozycje(pozycja);
        zamowienie.dodajPozycje(pozycja1);
        zamowienie.dodajPozycje(pozycja2);
        zamowienie.dodajPozycje(pozycja3);
        zamowienie.dodajPozycje(pozycja4);
        zamowienie.obliczWartoscZrabatem();
        zamowienie.wyswetlListeZamowien();


    }
}
