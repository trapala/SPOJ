//
// https://pl.spoj.com/problems/MWPZ06X/
// Nowa działka
//
package latweA.Strona1.A37_MWPZ06X;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            int number = scanner.nextInt();
            int wynik = (int) Math.pow(number, 2);
            System.out.println(wynik);
            t--;
        }
    }
}
