/*
https://pl.spoj.com/problems/FCTRL3
Dwie cyfry silni
*/

package A02_FCTRL3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Metoda zwracająca dwie ostatnie cyfry silni dla danej liczby
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests;

        tests = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < tests; i++) {
            numbers.add(scanner.nextInt()); // Wczytaj liczby testowe
        }

        numbers.stream()
                .map(Main::calculateFactorialLastTwoDigits) // Wywołaj metodę calculateFactorialLastTwoDigits() dla każdej liczby
                .forEach(result -> System.out.println(result[0] + " " + result[1])); // Wyświetl wynik w formacie "cyfra_dziesiątek cyfra_jedności"
    }
}

/*
 W metodzie calculateFactorialLastTwoDigits() zastosowałem proste obliczenia matematyczne, aby nie przekroczyć limitu czasu odpowiedzi.
 Jeżeli liczba jest większa lub równa 10, to zwracane są cyfry 0.
 W przeciwnym przypadku obliczana jest silnia przy użyciu modulo 100, a następnie cyfry dziesiątek i jedności są wydzielane za pomocą dzielenia i reszty z dzielenia.
 Użyłem kolekcji List do przechowywania liczb testowych.
 Następnie, przy użyciu strumieni, mapuję każdą liczbę na wynik calculateFactorialLastTwoDigits() i wyświetlam wynik w odpowiednim formacie.
 */