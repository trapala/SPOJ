//
// https://pl.spoj.com/problems/JPESEL/
// Pesel
//

package latweA.Strona1.A45_JPESEL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String[] line = scanner.nextLine().split("");
            int[] peselArray = new int[line.length];

            for (int j = 0; j < peselArray.length; j++) {
                peselArray[j] = Integer.parseInt(line[j]);
            }
            double wynik = peselArray[0] + peselArray[1] * 3 + peselArray[2] * 7 + peselArray[3] * 9 +
                    peselArray[4] + peselArray[5] * 3 + peselArray[6] * 7 + peselArray[7] * 9 +
                    peselArray[8] + peselArray[9] * 3 + peselArray[10];

            if (wynik > 0 && wynik % 10 == 0) {
                System.out.println("D");
            } else {
                System.out.println("N");
            }
        }
    }
}