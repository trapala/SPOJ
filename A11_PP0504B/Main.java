//
// https://pl.spoj.com/problems/PP0504B/
// StringMerge
//
package latweA.Strona1.A11_PP0504B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
           String word1 = scanner.next();
           String word2 = scanner.next();

          char[] charArray1 = word1.toCharArray();
          char[] charArray2 = word2.toCharArray();

            int licznik = word2.length();
            if (word2.length() > word1.length()) {
                licznik = word1.length();
            }

            char[] charArrays = new char[licznik*2];
          int a = 0;
          int b = 0;
            for (int k = 0; k < licznik; k++ ) {
                charArrays[a] = charArray1[b];
                charArrays[a+1] = charArray2[b];
                a += 2;
                b ++;
            }
            System.out.println(charArrays);
        }
    }
}
