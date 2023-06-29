/*
 * https://pl.spoj.com/problems/PTROL/
 * ROL
 */

package A17_PTROL;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program przesuwa elementy tablicy cyklicznie w lewo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // liczba testów

        // Przetwarzanie każdego testu
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // liczba elementów w tablicy
            int[] numbers = new int[n];

            // Wczytywanie elementów tablicy
            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt();
            }

            Case testCase = new Case(numbers);
            testCase.rotateLeft();

            // Wyświetlanie wyniku
            int[] rotatedNumbers = testCase.getNumbers();
            Arrays.stream(rotatedNumbers).forEach(num -> System.out.print(num + " "));
            System.out.println();
        }
    }
}

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class Case {
    private final int[] numbers;

    /**
     * Tworzy nowy obiekt klasy Case.
     *
     * @param numbers tablica liczb dla danego przypadku testowego.
     */
    public Case(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Przesuwa elementy tablicy cyklicznie w lewo.
     */
    public void rotateLeft() {
        int firstElement = numbers[0];
        System.arraycopy(numbers, 1, numbers, 0, numbers.length - 1);
        numbers[numbers.length - 1] = firstElement;
    }

    /**
     * Zwraca tablicę liczb dla danego przypadku testowego.
     *
     * @return tablica liczb.
     */
    public int[] getNumbers() {
        return numbers;
    }
}

/*
 * Program przesuwa elementy tablicy cyklicznie w lewo.
 * Algorytm polega na przeniesieniu pierwszego elementu na koniec tablicy, zachowując kolejność pozostałych elementów.
 * Wykorzystana jest klasa Case, która reprezentuje pojedynczy przypadek testowy.
 * Metoda rotateLeft() przeprowadza przesunięcie elementów tablicy.
 * Metoda getNumbers() zwraca tablicę liczb dla danego przypadku testowego.
 * Wyniki są wyświetlane na standardowym wyjściu za pomocą strumienia.
 */
