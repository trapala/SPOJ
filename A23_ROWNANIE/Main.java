/*
 * https://pl.spoj.com/problems/ROWNANIE/
 * Równanie kwadratowe
 */

package A23_ROWNANIE;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double A = scanner.nextDouble();
                double B = scanner.nextDouble();
                double C = scanner.nextDouble();

                double delta = Math.pow(B, 2) - (4 * A * C);
                System.out.println(result(delta));
            } else {
                return;
            }
        }
    }

    public static int result(double delta) {
        int number;
        if (delta > 0) {
            number = 2;
        } else if (delta == 0) {
            number = 1;
        } else {
            number = 0;
        }
        return number;
    }
}