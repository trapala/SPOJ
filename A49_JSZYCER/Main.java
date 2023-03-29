//
// https://pl.spoj.com/problems/JSZYCER/
// Szyfr Cezara
//

package latweA.Strona1.A48_JSZYCER;

import java.util.Scanner;

public class Main {
    private static String encrypt(String txt) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                int characterIndex = txt.charAt(i) - 'A';
                int characterShifted = (characterIndex + 3) % 26 + 'A';
                encrypted.append((char) characterShifted);
            } else {
                encrypted.append(txt.charAt(i));
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String text = scanner.nextLine();

            String encryptedTxt = encrypt(text);
            System.out.println(encryptedTxt);
        }
    }
}