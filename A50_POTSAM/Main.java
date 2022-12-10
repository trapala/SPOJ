//
// https://pl.spoj.com/problems/POTSAM/
// Samolot
//
package latweA.Strona2.A50_POTSAM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int n1 = Integer.parseInt(line[0]);
        int k1 = Integer.parseInt(line[1]);
        int n2 = Integer.parseInt(line[2]);
        int k2 = Integer.parseInt(line[3]);

        if (n1 > 0 && k1 > 0 && n2 > 0 && k2 > 0) {
            int miejsca = n1 * k1 + n2 * k2;
            System.out.println(miejsca);
        }
    }
}
