//
// https://pl.spoj.com/problems/PP0501A/
// NWD
//

package latweA.Strona1.A08_PP0501A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {
            String[] line = scanner.nextLine().split(" ");
            firstNumber = Integer.parseInt(line[0]);
            secondNumber = Integer.parseInt(line[1]);

            System.out.println(NWD(firstNumber, secondNumber));
        }
    }

    static int NWD(int a, int b) {
        if (b == 0)
            return a;
        else
            return NWD(b, a % b);
    }
}
