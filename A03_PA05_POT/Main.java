//
// https://pl.spoj.com/problems/PA05_POT
// Czy umiesz potęgować
//

package latweA.Strona1.A03_PA05_POT;

import java.util.Scanner;

public class Main { // moje

    public static void main(String[] args) {
        int base;
        int index;

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < tests; i++) {
            String[] line = scanner.nextLine().split(" ");
            base = Integer.valueOf(line[0]) % 10;
            index = (Integer.valueOf(line[1]) % 4) + 4;

            double powMod = Math.pow(base, index) % 10;
            System.out.println((int)powMod);

/*            base = scanner.nextInt();
            index = scanner.nextInt();
            double powMod = Math.pow(base, index) % 10;
            System.out.println((int)powMod);*/

        }
    }
}
