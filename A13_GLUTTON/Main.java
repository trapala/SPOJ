//
// https://pl.spoj.com/problems/GLUTTON/
// Obżartuchy
//

package latweA.Strona1.A13_GLUTTON;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int suma = 0;
            int[] czasArray = new int[n];
            int[] osobyArray = new int[n];

            for (int j = 0; j < n; j++) {
                czasArray[j] = scanner.nextInt();
                int czasDoby = 86400;
                osobyArray[j] = czasDoby / czasArray[j];
                suma += osobyArray[j];
            }
            if (suma % m != 0)
                suma = (suma / m) + 1;
            else {
                suma = suma / m;
            }
            System.out.println(suma);
        }
    }
}