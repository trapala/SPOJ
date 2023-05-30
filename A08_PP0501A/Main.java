/*
 * https://pl.spoj.com/problems/PP0501A/
 * NWD
 */


package A08_PP0501A;

import java.util.Scanner;

/**
 * Program oblicza największy wspólny dzielnik (NWD) dla podanych par liczb.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt(); // liczba testów

        for (int i = 0; i < testCount; i++) {
            int a = scanner.nextInt(); // pierwsza liczba
            int b = scanner.nextInt(); // druga liczba

            int result = nwd(a, b); // obliczenie największego wspólnego dzielnika
            System.out.println(result);
        }

        scanner.close();
    }

    /**
     * Metoda obliczająca największy wspólny dzielnik dwóch liczb.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return największy wspólny dzielnik
     */
    public static int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu oblicza największy wspólny dzielnik (NWD) dla podanych liczb.
 * Algorytm opiera się na iteracyjnym obliczaniu NWD przy użyciu algorytmu Euklidesa.
 * Wynik NWD jest wypisywany na standardowym wyjściu.
 * Metoda nwd oblicza największy wspólny dzielnik dwóch liczb.
 */