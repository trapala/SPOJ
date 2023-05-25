/*
 https://pl.spoj.com/problems/RNO_DOD
 Proste dodawanie
*/

package A06_RNO_DOD;

import java.util.Scanner;

/**
 * Program obliczający sumę liczb całkowitych podanych na wejściu.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt(); // liczba testów

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt(); // liczba liczb do zsumowania
            int[] numbers = new int[n];

            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt(); // wczytaj kolejną liczbę
            }

            int sum = sumNumbers(numbers); // oblicz sumę liczb
            System.out.println(sum);
        }

        scanner.close();
    }

    /**
     * Metoda obliczająca sumę liczb całkowitych z tablicy.
     *
     * @param numbers tablica liczb całkowitych
     * @return suma liczb całkowitych
     */
    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

/*
 Program wczytuje liczbę testów, a następnie dla każdego testu oblicza sumę liczb całkowitych podanych na wejściu.
 Algorytm polega na wczytaniu n-liczb i obliczeniu ich sumy.
 Wynik jest wypisywany na standardowe wyjście.
 Metoda sumNumbers przyjmuje tablicę liczb całkowitych i zwraca ich sumę.
 */

