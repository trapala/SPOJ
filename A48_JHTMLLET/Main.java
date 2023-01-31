//
// https://pl.spoj.com/problems/JHTMLLET/
// Tagi HTML
//
package latweA.Strona1.A47_JHTMLLET;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();
        boolean flagUpper = false;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String text = scanner.nextLine();

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '<') {
                    flagUpper = true;
                    output.append(text.charAt(i));
                    continue;
                }
                if (text.charAt(i) == '>') {
                    flagUpper = false;
                    output.append(text.charAt(i));
                    continue;
                }
                if (flagUpper) {
                    output.append(Character.toUpperCase(text.charAt(i)));
                } else {
                    output.append(text.charAt(i));
                }
            }
            System.out.println(output);
            output = new StringBuilder();
        }

    }
}
