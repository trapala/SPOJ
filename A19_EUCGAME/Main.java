//
// https://pl.spoj.com/problems/EUCGAME/
// Gra Euklidesa
//
package latweA.Strona1.A19_EUCGAME;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            System.out.println(a + b); // max 15 pt

        }
    }
}
