//
// https://pl.spoj.com/problems/PP0502B/
// Tablice
//
package latweA.Strona1.A09_PP0502B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tests = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < tests; i++) {
          int n = scanner.nextInt();
          int[] arrayInt = new int[n];

          for (int j = 0; j < n; j++) {
              arrayInt[j] = scanner.nextInt();
          }

          for (int k = n-1; k >= 0; k--) {
              System.out.print(arrayInt[k] + " ");
          }
          System.out.println();
      }
  }
}
