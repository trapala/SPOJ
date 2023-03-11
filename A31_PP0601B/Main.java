//
// https://pl.spoj.com/problems/PP0601B/
// Podzielność
//

package latweA.Strona1.A31_PP0601B;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        TreeSet<Integer> list = new TreeSet<>();

        while (t > 0) {
            String[] line = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int x = Integer.parseInt(line[1]);
            int y = Integer.parseInt(line[2]);

            while (n > 1) {
                if (n % x == 0 && n % y != 0) {
                    list.add(n);
                }
                n--;
            }

            for (int element : list) {
                System.out.print(element + " ");
            }

            System.out.println();

            list.clear();
            t--;
        }
    }
}
