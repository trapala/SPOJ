/*
 * https://pl.spoj.com/problems/PRZEDSZK
 * Przedszkolanka
 */

package A05_PRZEDSZK;

import java.util.Scanner;

/**
 * Program obliczający liczbę cukierków, które powinna kupić przedszkolanka, aby spełnić warunki rozdania cukierków dzieciom.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt(); // liczba testów

        for (int i = 0; i < testCases; i++) {
            int group1 = scanner.nextInt(); // liczba dzieci w grupie 1
            int group2 = scanner.nextInt(); // liczba dzieci w grupie 2

            int candies = calculateCandies(group1, group2);
            System.out.println(candies);
        }

        scanner.close();
    }

    /**
     * Metoda obliczająca liczbę cukierków, które przedszkolanka powinna kupić.
     *
     * @param group1 liczba dzieci w grupie 1
     * @param group2 liczba dzieci w grupie 2
     * @return liczba cukierków do zakupu
     */
    public static int calculateCandies(int group1, int group2) {
        int gcd = calculateGCD(group1, group2); // obliczenie największego wspólnego dzielnika

        // liczba cukierków to iloczyn dzieci w obu grupach, podzielona przez największy wspólny dzielnik
        int candies = (group1 * group2) / gcd;

        return candies;
    }

    /**
     * Metoda obliczająca największy wspólny dzielnik dwóch liczb.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return największy wspólny dzielnik
     */
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego zestawu danych oblicza liczbę cukierków, które przedszkolanka powinna zakupić.
 * Algorytm opiera się na obliczeniu największego wspólnego dzielnika liczby dzieci z obu grup.
 * Następnie, korzystając z tej wartości, obliczana jest minimalna liczba cukierków,
 * którą przedszkolanka powinna kupić, aby spełnić warunki rozdania cukierków dzieciom.
 * Metoda calculateCandies przyjmuje liczbę dzieci w obu grupach i zwraca liczbę cukierków do zakupu.
 * Metoda calculateGCD oblicza największy wspólny dzielnik dwóch liczb.
 * Wynik jest wypisywany na standardowe wyjście.
 */