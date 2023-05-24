/*
 https://pl.spoj.com/problems/PA05_POT
 Czy umiesz potęgować
 */

package A03_PA05_POT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Program sprawdza ostatnią cyfrę wyniku potęgowania liczby a do potęgi b.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // liczba przypadków do rozważenia

        List<Case> cases = new ArrayList<>();

        // Wczytanie danych dla każdego przypadku i dodanie go do listy cases
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(); // podstawa
            int b = scanner.nextInt(); // wykładnik
            cases.add(new Case(a, b));
        }

        // Wykorzystanie strumieni do przetwarzania listy cases i obliczenia ostatniej cyfry potęgi
        List<Integer> results = cases.stream()
                .map(Main::calculateLastDigit)
                .collect(Collectors.toList());

        // Wyświetlenie wyników
        results.forEach(System.out::println);

        scanner.close();
    }

    // Klasa reprezentująca pojedynczy przypadek
    static class Case {
        private final int a;
        private final int b;

        /**
         * Konstruktor klasy Case.
         *
         * @param a podstawa potęgi
         * @param b wykładnik potęgi
         */
        public Case(int a, int b) {
            this.a = a;
            this.b = b;
        }

        /**
         * Metoda zwracająca podstawę potęgi.
         *
         * @return podstawa potęgi
         */
        public int getA() {
            return a;
        }

        /**
         * Metoda zwracająca wykładnik potęgi.
         *
         * @return wykładnik potęgi
         */
        public int getB() {
            return b;
        }
    }

    /**
     * Metoda do wyznaczania ostatniej cyfry liczby ab.
     *
     * @param testCase obiekt klasy Case reprezentujący przypadek
     * @return ostatnia cyfra liczby ab
     */
    private static int calculateLastDigit(Case testCase) {
        int a = testCase.getA() % 10;
        int b = testCase.getB() % 4 + 4;

        if (a == 0) {
            return 0; // Jeśli podstawa jest 0, to wynik zawsze będzie 0
        }

        return (int) (Math.pow(a, b) % 10);
    }
}

/*
 Program wczytuje liczbę przypadków do rozważenia, a następnie dla każdego przypadku wczytuje parę liczb, a i b.
 Algorytm opiera się na obliczeniu ostatniej cyfry wyniku potęgowania liczby a do potęgi b.
 Wykorzystuję klasę Case do przechowywania danych dla poszczególnych przypadków.
 Metoda calculateLastDigit oblicza ostatnią cyfrę liczby ab, gdzie a jest podstawą potęgi, a wykładnikiem potęgi jest b.
 Wynik dla każdego przypadku jest wyświetlany na standardowym wyjściu.
 */
