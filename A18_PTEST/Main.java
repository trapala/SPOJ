/*
 * https://pl.spoj.com/problems/PTEST/
 * Zadanie próbne
 */

package A18_PTEST;

import java.util.Scanner;

/**
 * Program dodaje dwie liczby całkowite.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytywanie liczb a i b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Obliczanie sumy a + b i wyświetlenie wyniku
        System.out.println(a + b);
    }
}

/*
 * Program dodaje dwie liczby całkowite.
 * Algorytm polega na wczytaniu dwóch liczb z wejścia, a następnie obliczeniu ich sumy.
 * Wynik jest wyświetlany na standardowym wyjściu.
 */