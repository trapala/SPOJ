//
// https://pl.spoj.com/problems/JSZYCER/
// Szyfr Cezara
//
package latweA.Strona1.A48_JSZYCER;

import java.util.Scanner;

public class Main {

    private static String encrypt(String txt) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < txt.length(); i++)
        {
            if (Character.isUpperCase(txt.charAt(i)))
            {
                int characterIndex = txt.charAt(i) - 'A'; // A(65) - ASCII
                int characterShifted = (characterIndex + 3) % 26 + 'A'; // key(3) - przesunięcie o 3 znaki
                encrypted.append((char)characterShifted); // A=0, B=1... Z=25 - stąd modulo 26, aby nie przekroczyć zakresu ASCII
            }
            else
            {
                encrypted.append(txt.charAt(i));
            }
        }
        return encrypted.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String text = scanner.nextLine();

            String encryptedTxt = encrypt(text);
            System.out.println(encryptedTxt);
        }
    }
}

// https://mateuszrus.pl/szyfr-cezara/