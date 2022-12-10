//
// https://pl.spoj.com/problems/SUMA/
// SUMA
//
package latweA.Strona1.A22_SUMA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int liczba = scanner.nextInt();
                suma += liczba;
            } else {
                return;
            }
            System.out.println(suma);
        }
    }
}
