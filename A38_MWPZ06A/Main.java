//
// https://pl.spoj.com/problems/MWPZ06A/
// Ciążowy specjalista
//
package latweA.Strona1.A38_MWPZ06A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wM, wD;

        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            double x = scanner.nextDouble() * 12;
            double y = scanner.nextDouble() * 12;
            int z = scanner.nextInt();

            wM = Math.round((x * z / (z - 1)) - y);
            wD = wM - x;
            System.out.println((int) Math.abs(wD));

            t--;
        }
    }
}
