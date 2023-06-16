/*
 * https://pl.spoj.com/problems/SKARBFI/
 * SkarbFinder
 */

package A15_SKARBFI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program SkarbFinder służy do znajdowania najkrótszej drogi do skarbu na podstawie podanych wskazówek.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int instructions = scanner.nextInt();

            List<Case> cases = new ArrayList<>();

            for (int j = 0; j < instructions; j++) {
                int direction = scanner.nextInt();
                int steps = scanner.nextInt();
                cases.add(new Case(direction, steps));
            }

            List<String> path = findShortestPath(cases);
            printPath(path);
        }
    }

    /**
     * Metoda znajduje najkrótszą drogę do skarbu na podstawie listy wskazówek.
     *
     * @param cases lista wskazówek
     * @return lista kroków w drodze do skarbu lub informacja "studnia", jeśli skarb znajduje się w studni
     */
    public static List<String> findShortestPath(List<Case> cases) {
        int northSouth = 0;
        int eastWest = 0;

        for (Case c : cases) {
            int direction = c.getDirection();
            int steps = c.getSteps();

            if (direction == 0) {
                northSouth += steps;
            } else if (direction == 1) {
                northSouth -= steps;
            } else if (direction == 2) {
                eastWest -= steps;
            } else if (direction == 3) {
                eastWest += steps;
            }
        }

        List<String> path = new ArrayList<>();

        if (northSouth == 0 && eastWest == 0) {
            path.add("studnia");
        } else {
            if (northSouth != 0) {
                path.add(northSouth > 0 ? "0 " + northSouth : "1 " + (-northSouth));
            }
            if (eastWest != 0) {
                path.add(eastWest > 0 ? "3 " + eastWest : "2 " + (-eastWest));
            }
        }

        return path;
    }

    /**
     * Metoda wypisuje ścieżkę do skarbu.
     *
     * @param path lista kroków w drodze do skarbu
     */
    public static void printPath(List<String> path) {
        for (String step : path) {
            System.out.println(step);
        }
    }
}

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class Case {
    private final int direction;
    private final int steps;

    /**
     * Konstruktor klasy Case.
     *
     * @param direction kierunek
     * @param steps     liczba kroków
     */
    public Case(int direction, int steps) {
        this.direction = direction;
        this.steps = steps;
    }

    /**
     * Metoda zwraca kierunek.
     *
     * @return kierunek
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Metoda zwraca liczbę kroków.
     *
     * @return liczba kroków
     */
    public int getSteps() {
        return steps;
    }
}

/*
 * Program SkarbFinder służy do znajdowania najkrótszej drogi do skarbu na podstawie wskazówek z mapy.
 * Algorytm polega na sumowaniu kroków w odpowiednich kierunkach (północ-południe i wschód-zachód) i tworzeniu ścieżki do skarbu.
 * Klasa SkarbFinder jest wykorzystywana do głównego zarządzania procesem znajdowania skarbu, a klasa Case przechowuje informacje o pojedynczym zestawie danych.
 * Metoda findShortestPath() jest używana do znalezienia najkrótszej drogi do skarbu, a metoda printPath() służy do wyświetlenia ścieżki do skarbu.
 * Dane są wyświetlane poprzez wypisanie ich na standardowym wyjściu.
 */