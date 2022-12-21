//
// https://pl.spoj.com/problems/ETI06F1/
// Pole pewnego koła
//
package latweA.Strona1.A10_ETI06F1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double d = scanner.nextDouble();

            double pi = 3.141592654;

            double r2 = Math.pow(r, 2);
            double d2 = Math.pow(d, 2) / 4;
            double output = (r2 - d2) * pi;

            output *= 100;
            output = Math.round(output);
            output /= 100;
            System.out.println(output);
    }
}
//
// Wyznaczyć z tw. Pitagorasa x^2 + d/2^2 = r^2
// jak wyznaczymy szukane x^2 to obliczamy pole koła x^2 * pi
//

