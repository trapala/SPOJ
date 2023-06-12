/*
 * https://pl.spoj.com/problems/PP0506A/
 * Sort 1
 */


package A14_PP0506A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Program służący do sortowania i określania odległości punktu od początku układu współrzędnych.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaPrzypadkow = scanner.nextInt();

        for (int i = 0; i < liczbaPrzypadkow; i++) {
            List<MyComp> punkty = wczytajPunkty(scanner);

            Collections.sort(punkty);

            wypiszPunkty(punkty);
        }
    }

    /**
     * Wczytuje listę punktów z danego przypadku testowego.
     *
     * @param scanner wczytywanie danych
     * @return lista punktów
     */
    private static List<MyComp> wczytajPunkty(Scanner scanner) {
        int liczbaPunktow = scanner.nextInt();
        List<MyComp> punkty = new ArrayList<>();

        for (int j = 0; j < liczbaPunktow; j++) {
            String nazwa = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            double odleglosc = obliczOdleglosc(x, y);

            punkty.add(new MyComp(nazwa, x, y, odleglosc));
        }

        return punkty;
    }

    /**
     * Oblicza odległość euklidesową punktu od początku układu współrzędnych.
     *
     * @param x współrzędna x punktu
     * @param y współrzędna y punktu
     * @return odległość od początku układu współrzędnych
     */
    private static double obliczOdleglosc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Wypisuje posortowaną listę punktów.
     *
     * @param punkty lista punktów
     */
    private static void wypiszPunkty(List<MyComp> punkty) {
        for (MyComp punkt : punkty) {
            System.out.println(punkt.getNazwa() + " " + punkt.getX() + " " + punkt.getY());
        }
        System.out.println();
    }
}

/**
 * Klasa reprezentująca pojedynczy punkt w przestrzeni dwuwymiarowej.
 */
class MyComp implements Comparable<MyComp> {
    private final String nazwa;
    private final int x;
    private final int y;
    private final double odleglosc;

    /**
     * Konstruktor klasy MyComp.
     *
     * @param nazwa     nazwa punktu
     * @param x         współrzędna x punktu
     * @param y         współrzędna y punktu
     * @param odleglosc odległość od początku układu współrzędnych
     */
    public MyComp(String nazwa, int x, int y, double odleglosc) {
        this.nazwa = nazwa;
        this.x = x;
        this.y = y;
        this.odleglosc = odleglosc;
    }

    /**
     * Zwraca nazwę punktu.
     *
     * @return nazwa punktu
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Zwraca współrzędną x punktu.
     *
     * @return współrzędna x punktu
     */
    public int getX() {
        return x;
    }

    /**
     * Zwraca współrzędną y punktu.
     *
     * @return współrzędna y punktu
     */
    public int getY() {
        return y;
    }

    @Override
    public int compareTo(MyComp o) {
        return Double.compare(this.odleglosc, o.odleglosc);
    }
}

/*
 * Program wczytuje liczbę przypadków do rozważenia, a następnie dla każdego przypadku wczytuje listę punktów w przestrzeni dwuwymiarowej.
 * Algorytm programu polega na obliczeniu odległości od początku układu współrzędnych dla każdego punktu i posortowaniu punktów na podstawie tej odległości.
 * Program wykorzystuje klasę MyComp do przechowywania danych dla poszczególnych punktów i implementuje interfejs Comparable do sortowania.
 * Posortowana lista punktów jest następnie wypisywana na standardowym wyjściu dla każdego przypadku testowego.
 */