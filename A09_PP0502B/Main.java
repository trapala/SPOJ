/*
 * https://pl.spoj.com/problems/PP0502B/
 * Tablice
 */

package A09_PP0502B;

import java.util.Scanner;

/**
 * Program odwraca kolejność elementów w tablicy.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt(); // liczba testów

        for (int i = 0; i < testCount; i++) {
            int n = scanner.nextInt(); // liczba elementów w tablicy
            int[] array = new int[n];

            // Wczytanie elementów tablicy
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }

            // Odwrócenie kolejności elementów w tablicy
            reverseArray(array);

            // Wyświetlenie odwróconej tablicy
            for (int j = 0; j < n; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Metoda odwracająca kolejność elementów w tablicy.
     *
     * @param array tablica liczb
     */
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Zamiana miejscami elementów na krańcach tablicy
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu wczytuje liczbę elementów w tablicy oraz same elementy.
 * Następnie program odwraca kolejność elementów w tablicy za pomocą metody reverseArray, a potem wypisuje odwróconą tablicę.
 * Metoda reverseArray odwraca kolejność elementów w tablicy poprzez zamianę miejscami elementów na krańcach tablicy.
 */

