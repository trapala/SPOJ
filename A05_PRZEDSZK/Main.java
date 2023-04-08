//
// https://pl.spoj.com/problems/PRZEDSZK
// Przedszkolanka
//

package latweA.Strona1.A05_PRZEDSZK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstGroup, secondGroup;
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {
            String[] line = scanner.nextLine().split(" ");
            firstGroup = Integer.parseInt(line[0]);
            secondGroup = Integer.parseInt(line[1]);
            
            System.out.println(NWW(firstGroup, secondGroup));
        }
    }

    static int NWD(int a, int b) {
        if (b == 0)
            return a;
        else
            return NWD(b, a % b);
    }

    static int NWW(int a, int b) {
        return a * b / NWD(a, b);
    }
}

