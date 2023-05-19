//
// https://pl.spoj.com/problems/PRIME_T
// Liczby Pierwsze
//

package latweA.Strona1.A01_PRIME_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // liczba testów

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt()); // wczytaj liczby
        }

        numbers.stream()
                .map(Main::isPrime)
                .forEach(isPrime -> System.out.println(isPrime ? "TAK" : "NIE"));
    }

    // Metoda sprawdzająca, czy liczba jest liczbą pierwszą
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

//    Użyłem kolekcji List do przechowywania wczytanych liczb.
//    Następnie przekształcam tę listę na strumień przy pomocy metody stream().
//    Wykorzystuję metodę map() do wywołania metody isPrime() na każdym elemencie strumienia.
//    Na końcu używam metody forEach() do wyświetlenia wyników dla każdej liczby.