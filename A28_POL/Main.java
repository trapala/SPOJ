/*
 * https://pl.spoj.com/problems/POL/
 * Połowa
 */


package A28_POL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();

        for (int i = 0; i < howMany; i++) {
            String line = scanner.next();
            System.out.println(line.substring(0, line.length() / 2));
        }
    }
}