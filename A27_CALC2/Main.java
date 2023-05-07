//
// https://pl.spoj.com/problems/CALC2/
// Kalkulator2
//

package latweA.Strona1.A27_CALC2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rejestr = new int[10];
        Arrays.fill(rejestr, 0);

        int suma;
        while (scanner.hasNext()) {
            String znak = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (znak.equals("z")) {
                rejestr[a] = b;
            } else {
                switch (znak) {
                    case "+":
                        suma = rejestr[a] + rejestr[b];
                        break;
                    case "-":
                        suma = rejestr[a] - rejestr[b];
                        break;
                    case "*":
                        suma = rejestr[a] * rejestr[b];
                        break;
                    case "/":
                        suma = rejestr[a] / rejestr[b];
                        break;
                    case "%":
                        suma = rejestr[a] % rejestr[b];
                        break;
                    default:
                        return;
                }
                System.out.println(suma);
            }
        }
    }
}