//
// https://pl.spoj.com/problems/PP0504D/
// Reprezentacja liczb typu float
//

package latweA.Strona1.A12_PP0504D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {

            float line = scanner.nextFloat();
            long bits = Float.floatToIntBits(line);
            //    long bits = 272214023; // system dziesiętny
            System.out.println(bits);
            int k = (byte) (bits >> 24) & 0xff; // 16, iloczyn bitowy AND otrzymujemy 8 najmłodszych bitów po przesunięciu >>(w prawo)
            int k2 = (byte) (bits >> 16) & 0xff; // 57
            int k3 = (byte) (bits >> 8) & 0xff; // 168
            int k4 = (byte) (bits) & 0xff; // 7

            System.out.println(Integer.toHexString(k) + " " + Integer.toHexString(k2) + " " + Integer.toHexString(k3) + " " + Integer.toHexString(k4));
        }  // wynik w systemie base 16 = 10 39 a8 7
    }
}