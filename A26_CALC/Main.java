//
// https://pl.spoj.com/problems/CALC/
// Kalkulator
//

package latweA.Strona1.A26_CALC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in)
        int suma;
        
        while (scanner.hasNext()) {
            String znak = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (znak) {
                case "+":
                    suma = a + b;
                    break;
                case "-":
                    suma = a - b;
                    break;
                case "*":
                    suma = a * b;
                    break;
                case "/":
                    suma = a / b;
                    break;
                case "%":
                    suma = a % b;
                    break;
                default:
                    return;
            }
            System.out.println(suma);
        }
    }
}