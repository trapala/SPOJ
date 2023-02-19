//
// https://pl.spoj.com/problems/FCTRL3
// Dwie cyfry silni
//

package latweA.Strona1.A02_FCTRL3;

import java.util.Scanner;

public class Main {
    private static int[] factorionNumbers(int num) {
        switch (num) {
            case 0:
            case 1:
                return new int[]{0, 1};
            case 2:
                return new int[]{0, 2};
            case 5:
            case 6:
            case 8:
                return new int[]{2, 0};
            case 3:
                return new int[]{0, 6};
            case 4:
                return new int[]{2, 4};
            case 7:
                return new int[]{4, 0};
            case 9:
                return new int[]{8, 0};
            default:
                return new int[]{0, 0};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests;
        int number;
        tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            number = scanner.nextInt();
            int[] result = factorionNumbers(number);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}