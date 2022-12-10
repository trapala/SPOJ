//
// https://pl.spoj.com/problems/EUCGAME/
// Gra Euklidesa
//
package latweA.Strona1.A19_EUCGAME;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(euclides(a, b)); // 3 test nie zaliczony
        }
    }

    public static int euclides(int a, int b) {
        if (a == b)
            return a + b;
        else if (a > b)
            return euclides(a - b, b);
        else
            return euclides(b, a);
    }
}
