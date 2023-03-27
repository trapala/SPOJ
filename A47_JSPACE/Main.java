//
// https://pl.spoj.com/problems/JSPACE/
// Spacje
//

package latweA.Strona1.A47_JSPACE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();
        boolean flagUpper = false;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String tekst = scanner.nextLine();

            for (int i = 0; i < tekst.length(); i++) {
                if (tekst.charAt(i) == ' ') {
                    flagUpper = true;
                    continue;
                }
                if (flagUpper) {
                    output.append(Character.toUpperCase(tekst.charAt(i)));
                    flagUpper = false;
                    continue;
                }
                output.append(tekst.charAt(i));
            }
            System.out.println(output);
            output = new StringBuilder();
        }
    }
}