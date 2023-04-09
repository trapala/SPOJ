//
// https://pl.spoj.com/problems/RNO_DOD
// Proste dodawanie
//

package latweA.Strona1.A06_RNO_DOD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.valueOf(scanner.nextLine());

        while (tests > 0) {
            int line = scanner.nextInt();
            scanner.nextLine();
            int suma = 0;
            
            while (line > 0) {
                suma += scanner.nextInt();
                line--;
            }
            System.out.println(suma);
            tests--;
        }
    }
}
