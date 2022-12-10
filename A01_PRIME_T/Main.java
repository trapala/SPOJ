//
// https://pl.spoj.com/problems/PRIME_T
// Liczby Pierwsze
//
package latweA.Strona1.A01_PRIME_T;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner scanner1 = new Scanner(System.in);
        int tests = scanner1.nextInt();
        int[] input = new int[tests];

        for (int i = 0; i < tests; i++) {
            input[i] = scanner1.nextInt();
        }

        for (int i = 0; i < tests; i++) {
            System.out.println(isPrime(input[i]));
        }
    }

    public static String isPrime(int n) {
        if (n == 1) {
            return "NIE";
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "NIE";
            }
        }
        return "TAK";
    }
}