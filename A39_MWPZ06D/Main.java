//
// https://pl.spoj.com/problems/MWPZ06D/
// Imieniny
//

package latweA.Strona1.A39_MWPZ06D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t;
        int l, c;

        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            l = scanner.nextInt();
            c = scanner.nextInt();

            if (c == 0) {
                System.out.println("NIE");
                continue;
            }
            if (l == 0) {
                System.out.println("TAK");
                continue;
            }
            if (l == 1 && c >= 1) {
                System.out.println("TAK");
                continue;
            }
            if (l == 2 && c > 0) {
                System.out.println("NIE");
                continue;
            }
            
            l--;

            if (c % l == 0) System.out.println("NIE");
            else System.out.println("TAK");
        }
    }
}