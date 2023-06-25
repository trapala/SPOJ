/*
 * https://pl.spoj.com/problems/PTROL/
 * ROL
 */


package A17_PTROL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
            int ileLiczb = scanner.nextInt();
            int[] liczby = new int[ileLiczb];

            for (int j = 0; j < ileLiczb; j++) {
                liczby[j] = scanner.nextInt();
            }

            int[] wyswietl = leftArray(liczby);
            for (int n : wyswietl) System.out.print(n + " ");
        }
    }

    static int[] leftArray(int[] array) {
        int temp = array[0];
        
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;

        return array;
    }
}