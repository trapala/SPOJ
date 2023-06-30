/*
 * https://pl.spoj.com/problems/EUCGAME/
 * Gra Euklidesa
 */

package A19_EUCGAME;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program oblicza liczbę żetonów pozostałych w grze w chwili jej zakończenia.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytanie liczby partii
        int t = scanner.nextInt();

        // Lista przechowująca przypadki testowe
        List<TestCase> testCases = new ArrayList<>();

        // Wczytanie danych wejściowych
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            testCases.add(new TestCase(a, b));
        }

        // Obliczenie łącznej liczby żetonów po zakończeniu każdej partii
        for (TestCase testCase : testCases) {
            int totalTokens = calculateTotalTokens(testCase.a, testCase.b);
            System.out.println(totalTokens);
        }
    }

    /**
     * Klasa reprezentująca pojedynczy przypadek testowy.
     */
    static class TestCase {
        int a;
        int b;

        /**
         * Konstruktor klasy TestCase.
         *
         * @param a początkowa liczba żetonów gracza A
         * @param b początkowa liczba żetonów gracza B
         */
        public TestCase(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    /**
     * Metoda obliczająca łączną liczbę żetonów po zakończeniu partii.
     *
     * @param a początkowa liczba żetonów gracza A
     * @param b początkowa liczba żetonów gracza B
     * @return łączna liczba żetonów po zakończeniu partii
     */
    private static int calculateTotalTokens(int a, int b) {
        // Wykonywanie ruchów, dopóki jeden z graczy ma więcej żetonów
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        // Obliczenie łącznej liczby żetonów
        int totalTokens = a + b;
        return totalTokens;
    }
}

/*
 * Program rozwiązuje problem gry Euklidesa, polegający na obliczeniu łącznej liczby żetonów pozostałych w grze po zakończeniu partii.
 * Algorytm polega na wczytaniu liczby partii oraz początkowych liczby żetonów dla każdej partii,
 * a następnie dla każdego przypadku testowego obliczeniu łącznej liczby żetonów.
 * Klasy TestCase reprezentuje pojedynczy przypadek testowy, przechowując początkowe liczby żetonów graczy A i B.
 * Przypadki testowe są przechowywane w liście testCases za pomocą kolekcji ArrayList.
 * Obliczenie łącznej liczby żetonów dla każdego przypadku testowego odbywa się za pomocą metody calculateTotalTokens.
 * Wynik jest wyświetlany na standardowym wyjściu.
 */
