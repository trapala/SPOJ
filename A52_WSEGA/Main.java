//
// https://pl.spoj.com/problems/WSEGA/
// Wiek segmentolka
//

package latweA.Strona2.A53_WSEGA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        while (tests > 0) {
            int numberOfSegments = scanner.nextInt();
            int buffer = 0;

            for (int i = 0; i < numberOfSegments; i++) {
                buffer += scanner.nextInt();
            }
            System.out.println(buffer + (numberOfSegments - 1));

            tests--;
        }
    }
}