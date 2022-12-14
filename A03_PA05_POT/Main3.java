// źródło github
package latweA.Strona1.A03_PA05_POT;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws IOException {
        int base;
        int index;
        int c;

        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            base = scanner.nextInt();
            index = scanner.nextInt();
            System.out.println(String.valueOf(pModular(base, index)));
        }
    }

    private static long pModular(int base, int index) {
        int i;
        int result = 1;
        final int modulation = 10;
        long x = base % modulation;

        for (i = 1; i <= index; i <<= 1) {
            x %= modulation;
            if ((index & i) != 0) {
                result *= x;
                result %= modulation;
            }
            x *= x;
        }

        return result;
    }
}