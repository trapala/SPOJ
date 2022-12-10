//
// https://pl.spoj.com/problems/SYS/
// Systemy pozycyjne
//
package latweA.Strona1.A30_SYS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());
        while (t > 0) {
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println(Integer.toHexString(input).toUpperCase() + " " + system11(input));
            t--;
        }
    }
    private static String system11(int liczba) {
        // cyfry:0,1,2,3,4,5,6,7,8,9,A
        StringBuilder sb = new StringBuilder();
        while (liczba != 0) {
            if (liczba % 11 <= 9) {
                sb.append(liczba % 11);
                // System.out.println("if: " + sb);
            } else {
                sb.append('A');
                //  System.out.println("else: " + sb);
            }
            liczba = liczba / 11;
            // System.out.println("liczba: " + liczba);
        }
        sb.reverse();
        // System.out.println("reverse: " + sb);
        return sb.toString();
    }
}
