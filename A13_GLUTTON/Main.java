/*
 * https://pl.spoj.com/problems/GLUTTON/
 * Obżartuchy
 */

package A13_GLUTTON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program obliczający liczbę pudełek ciastek potrzebną na Zlot Obżartuchów.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();

        List<Case> cases = new ArrayList<>();

        for (int i = 0; i < testCount; i++) {
            int participants = scanner.nextInt(); // liczba zaproszonych obżartuchów na Zlot
            int cookiesPerBox = scanner.nextInt();

            List<Integer> eatingTimes = new ArrayList<>();
            for (int j = 0; j < participants; j++) {
                int time = scanner.nextInt();
                eatingTimes.add(time);
            }

            cases.add(new Case(cookiesPerBox, eatingTimes));
        }

        for (Case testCase : cases) {
            int boxesNeeded = testCase.calculateBoxesNeeded();
            System.out.println(boxesNeeded);
        }
    }
}

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class Case {
    private final int cookiesPerBox;
    private final List<Integer> eatingTimes;

    /**
     * Konstruktor klasy Case.
     * @param cookiesPerBox liczba ciastek w jednym pudełku
     * @param eatingTimes czasy jedzenia pojedynczego ciastka przez obżartuchów
     */
    public Case(int cookiesPerBox, List<Integer> eatingTimes) {
        this.cookiesPerBox = cookiesPerBox;
        this.eatingTimes = eatingTimes;
    }
    /**
     * Metoda obliczająca liczbę pudełek ciastek potrzebną na Zlot.
     * @return liczba pudełek ciastek
     */
    public int calculateBoxesNeeded() {
        int totalTime = 0;
        for (int time : eatingTimes) {
            totalTime += 86400 / time; // 86400 - liczba sekund w dobie
        }

        int boxesNeeded = (int) Math.ceil((double) totalTime / cookiesPerBox);
        return boxesNeeded;
    }
}

/*
 * Program GLUTTON oblicza liczbę pudełek ciastek potrzebną na Zlot Obżartuchów.
 * Algorytm polega na sumowaniu czasów jedzenia ciastek przez obżartuchów i dzieleniu tej sumy przez liczbę ciastek w jednym pudełku.
 * Wykorzystywana jest klasa Case, która reprezentuje pojedynczy przypadek testowy.
 * Metoda calculateBoxesNeeded() jest wykorzystywana do obliczania liczby pudełek ciastek.
 * Wyniki są wyświetlane na standardowym wyjściu.
 */