// odpowiedź błędna
package latweA.Strona1.A11_PP0504B;

import java.util.Scanner;

public class Main2 {
    //    https://pl.spoj.com/problems/PP0504B/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {

            String[] line = scanner.nextLine().split(" ");
            char[] word1 = line[0].toCharArray();
            char[] word2 = line[1].toCharArray();


           char[] output = string_merge(word1, word2);
            for (char c : output) {
                System.out.print(c);
            }
        }
    }

    static char[] string_merge(char[] word1, char[] word2) {

        int licznik = word2.length;
        if (word2.length > word1.length) {
            licznik = word1.length;
        }

/*      StringBuilder sb = new StringBuilder();
        sb.append(word1);
        sb.append(word2);
        char[] result = sb.toString().toCharArray();
        System.out.println("result[0]: " + result[0]);*/


        char[] newChar = new char[licznik * 2];
        for (int k = 0; k < licznik; k++) {
            newChar[k] = (char) (word1[k] + word2[k]);

        }
        return newChar; // przekazuje złe kodowanie

    }

}
