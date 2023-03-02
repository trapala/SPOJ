//
// https://pl.spoj.com/problems/BINOMS/
// Dwumiany
//

package latweA.Strona1.A21_BINOMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {
            String[] line = scanner.nextLine().split(" ");

            double a = Double.parseDouble(line[0]);
            double b = Double.parseDouble(line[1]);

            System.out.println((int) SymbolNewtona(a, b));
        }
    }

    private static double SymbolNewtona(double a, double b) {
        double wynik = 1;
        for (int i = 1; i <= b; i++) {
            wynik = (wynik * (a - i + 1)) / i;
        }
        return Math.round(wynik);
    }
}