//
// https://pl.spoj.com/problems/PP0602D/
// ROL (k)
//
package latweA.Strona1.A45_PP0602D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        String[] line = scanner.nextLine().split(" ");
        int[] numbersArray = new int[n];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(line[i]);
        }

        for (int i = k; i < n; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
