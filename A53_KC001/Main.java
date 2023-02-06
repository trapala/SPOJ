//
// https://pl.spoj.com/problems/KC001/
// Dodawanie liczb całkowitych
//
package latweA.Strona2.A53_KC001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int output = 0;
        for (int i = 0; i < 3; i++) {
            input = scanner.nextInt();
            output += input;
        }
        System.out.println(output);
    }
}
