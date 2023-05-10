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
        StringBuilder sb = new StringBuilder();
        while (liczba != 0) {
            if (liczba % 11 <= 9) {
                sb.append(liczba % 11);
            } else {
                sb.append('A');
            }
            liczba = liczba / 11;
        }
        sb.reverse();
        return sb.toString();
    }
}