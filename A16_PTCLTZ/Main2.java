// źródło github
package latweA.Strona1.A16_PTCLTZ;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int numberOfCases = scaner.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int x0 = scaner.nextInt();
            int n = 0;
            if (x0 == 1) {
                n = 0;
            } else {
                n = 0;
                while (x0 != 1) {
                    if (x0 % 2 == 0) {
                        x0 = x0 / 2;
                        n++;
                    }
                    if (x0 % 2 != 0 && x0 > 1) {
                        x0 = 3 * x0 + 1;
                        n++;
                    }
                }
            }
            System.out.println(Integer.toString(n));
        }

    }
}
