//
// https://pl.spoj.com/problems/PTCLTZ/
// Problem Collatza
//
package latweA.Strona1.A16_PTCLTZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
            int s = scanner.nextInt();
            int n;

            if (s == 1) {
                n = 0;
            } else {
                n = 0;
                while (s != 1) {
                    if (s % 2 == 0) { // parzyste
                        s = s / 2;
                        System.out.println("Parzyste s: " + s);
                        n++;
                        System.out.println("Parzyste n: " + n);
                    }
                    if (s % 2 != 0 && s > 1) {
                        s = 3 * s + 1;
                        System.out.println("Nieparzyste s: " + s);
                        n++;
                        System.out.println("Nieparzyste n: " + n);
                    }
                }
            }
            System.out.println(n);
        }
    }
}
