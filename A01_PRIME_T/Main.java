/*
 * https://pl.spoj.com/problems/PRIME_T
 * Liczby Pierwsze
 */

package A01_PRIME_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program sprawdza, czy podane liczby są liczbami pierwszymi.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt(); // liczba testów

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            numbers.add(scanner.nextInt()); // wczytaj liczby
        }

        numbers.stream()
                .map(Main::isPrime)
                .forEach(isPrime -> System.out.println(isPrime ? "TAK" : "NIE"));
    }

    /**
     * Metoda sprawdzająca, czy liczba jest liczbą pierwszą.
     *
     * @param number liczba do sprawdzenia
     * @return true, jeśli liczba jest liczbą pierwszą; false w przeciwnym razie
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu sprawdza, czy podana liczba jest liczbą pierwszą.
 * Algorytm opiera się na iteracyjnym sprawdzaniu podzielności liczby przez liczby od 2 do pierwiastka kwadratowego z tej liczby.
 * Użyłem kolekcji List do przechowywania wczytanych liczb.
 * Następnie przekształcam tę listę na strumień przy pomocy metody stream().
 * Wykorzystuję metodę map() do wywołania metody isPrime() na każdym elemencie strumienia.
 * Na końcu używam metody forEach() do wyświetlenia wyników dla każdej liczby.
 * Wynik dla każdego testu jest wypisywany na standardowe wyjście jako 'TAK', jeśli liczba jest pierwsza, lub 'NIE', jeśli nie jest.
 */