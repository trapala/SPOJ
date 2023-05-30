/*
 * https://pl.spoj.com/problems/BFN1/
 * Zabawne Dodawanie Piotrusia
 */

package A07_BFN1;

import java.util.Scanner;

/**
 * Program oblicza palindrom i liczbę dodawań dla podanych liczb.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt(); // liczba testów

        for (int i = 0; i < testCount; i++) {
            int number = scanner.nextInt(); // liczba do przetworzenia

            int[] result = calculatePalindrome(number); // obliczenie palindromu i liczby dodawań
            System.out.println(result[0] + " " + result[1]);
        }

        scanner.close();
    }

    /**
     * Metoda sprawdzająca, czy liczba jest palindromem.
     *
     * @param number liczba do sprawdzenia
     * @return true, jeśli liczba jest palindromem, false w przeciwnym przypadku
     */
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    /**
     * Metoda obliczająca palindrom i liczbę dodawań dla danej liczby.
     *
     * @param number liczba do przetworzenia
     * @return tablica zawierająca palindrom i liczbę dodawań [palindrom, liczbaDodawan]
     */
    public static int[] calculatePalindrome(int number) {
        int palindrome = number;
        int additions = 0;

        while (!isPalindrome(palindrome)) {
            int reverse = Integer.parseInt(new StringBuilder(Integer.toString(palindrome)).reverse().toString());
            palindrome += reverse;
            additions++;
        }

        return new int[]{palindrome, additions};
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu oblicza palindrom i liczbę dodawań prowadzących do tego palindromu.
 * Algorytm polega na sprawdzeniu, czy liczba jest palindromem. Jeśli nie, liczba zostaje odwrócona i dodana do pierwotnej liczby.
 * Proces jest powtarzany, aż osiągnięty zostanie palindrom. Wynik, czyli palindrom i liczba dodawań, jest wypisywany na standardowym wyjściu.
 * Metoda isPalindrome sprawdza, czy liczba jest palindromem. Metoda calculatePalindrome oblicza palindrom i liczbę dodawań dla danej liczby.
 */