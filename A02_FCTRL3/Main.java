/*
 * https://pl.spoj.com/problems/FCTRL3
 * Dwie cyfry silni
 */

package A02_FCTRL3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program oblicza dwie ostatnie cyfry silni dla podanej liczby.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            numbers.add(scanner.nextInt()); // Wczytaj liczby testowe
        }

        numbers.stream()
                .map(Main::calculateFactorialLastTwoDigits) // Wywołaj metodę calculateFactorialLastTwoDigits() dla każdej liczby
                .forEach(result -> System.out.println(result[0] + " " + result[1])); // Wyświetl wynik w formacie "cyfra_dziesiątek cyfra_jedności"
    }

    /**
     * Metoda zwracająca dwie ostatnie cyfry silni dla danej liczby.
     *
     * @param num liczba, dla której obliczane są dwie ostatnie cyfry silni
     * @return tablica zawierająca dwie ostatnie cyfry silni: [cyfra_dziesiątek, cyfra_jedności]
     */
    private static int[] calculateFactorialLastTwoDigits(int num) {
        int tensDigit;
        int onesDigit;

        if (num >= 10) {
            tensDigit = 0;
            onesDigit = 0;
        } else {
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial = (factorial * i) % 100;
            }
            tensDigit = factorial / 10;
            onesDigit = factorial % 10;
        }

        return new int[]{tensDigit, onesDigit};
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu oblicza dwie ostatnie cyfry silni dla podanej liczby.
 * Algorytm polega na iteracyjnym obliczaniu silni dla danej liczby, zwracając jedynie dwie ostatnie cyfry wyniku.
 * W metodzie calculateFactorialLastTwoDigits() zastosowałem proste obliczenia matematyczne, aby nie przekroczyć limitu czasu odpowiedzi.
 * Jeżeli liczba jest większa lub równa 10, to zwracane są dwie cyfry 0.
 * W przeciwnym przypadku obliczana jest silnia przy użyciu modulo 100, a następnie cyfry dziesiątek i jedności są wydzielane za pomocą dzielenia i reszty z dzielenia.
 * Użyłem kolekcji List do przechowywania liczb testowych.
 * Następnie, przy użyciu strumieni, mapuję każdą liczbę na wynik calculateFactorialLastTwoDigits() i wyświetlam wynik w odpowiednim formacie.
 */