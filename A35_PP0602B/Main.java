//
// https://pl.spoj.com/problems/PP0602B/
// Tabelki liczb
//
package latweA.Strona1.A35_PP0602B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());

        while (tests > 0) {

            int l = Integer.parseInt(scanner.next());
            int k = Integer.parseInt(scanner.next());

            int[][] tab = new int[l][k];
            int[][] newTab = new int[l][k];

            for (int i = 0; i < l; i++) {
                for (int n = 0; n < k; n++) {
                    tab[i][n] = Integer.parseInt(scanner.next());
                    newTab[i][n] = tab[i][n];
                }
            }

            for (int i = 0; i < k - 1; i++) {
                newTab[0][i] = tab[0][i + 1]; // up
                newTab[l - 1][i + 1] = tab[l - 1][i]; // down

            }

            for (int i = 0; i < l - 1; i++) {
                newTab[i + 1][0] = tab[i][0]; // left
                newTab[i][k - 1] = tab[i + 1][k - 1]; // right

            }

            for (int i = 0; i < l; i++) {
                for (int n = 0; n < k; n++) {
                    System.out.print(newTab[i][n] + " ");
                }
                System.out.println();
            }

            tests--;
        }
    }
}
