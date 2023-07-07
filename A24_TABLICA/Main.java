/*
 * https://pl.spoj.com/problems/TABLICA/
 * Tablica
 */

package A24_TABLICA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int[] numer = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            numer[i] = Integer.parseInt(line[i]);
        }

        for (int j = numer.length - 1; j >= 0; j--) {
            System.out.print(numer[j] + " ");
        }
    }
}
