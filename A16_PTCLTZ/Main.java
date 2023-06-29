/*
 * https://pl.spoj.com/problems/PTCLTZ/
 * Problem Collatza
 */

package A16_PTCLTZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program oblicza pierwszą wartość n, dla której xn=1 w ciągu rekurencyjnym.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // liczba testów

        List<Case> cases = new ArrayList<>();

        // Wczytywanie danych testowych
        for (int i = 0; i < t; i++) {
            int s = scanner.nextInt(); // wartość początkowa ciągu xn
            cases.add(new Case(s));
        }

        // Obliczanie wartości n i wyświetlanie wyników
        for (Case c : cases) {
            int n = c.calculateN();
            System.out.println(n);
        }
    }
}

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class Case {
    private int s;

    /**
     * Tworzy nowy obiekt klasy Case.
     *
     * @param s wartość początkowa ciągu xn.
     */
    public Case(int s) {
        this.s = s;
    }

    /**
     * Oblicza pierwszą wartość n, dla której xn=1.
     *
     * @return wartość n.
     */
    public int calculateN() {
        int n = 0;
        int x = s;
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            n++;
        }
        return n;
    }
}

/*
 * Program oblicza pierwszą wartość n, dla której xn=1 w ciągu rekurencyjnym.
 * Algorytm polega na iteracyjnym obliczaniu kolejnych wartości ciągu xn na podstawie parzystości aktualnej wartości.
 * Wykorzystana jest klasa Case, która reprezentuje pojedynczy przypadek testowy.
 * Metoda calculateN() oblicza wartość n dla danego przypadku.
 * Wyniki są wyświetlane na standardowym wyjściu za pomocą metody
 */
