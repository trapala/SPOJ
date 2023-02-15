//
// https://pl.spoj.com/problems/FLAMASTE
// Flamaster
//

package latweA.Strona1.A04_FLAMASTE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            String str = scanner.next();

            String[] strArray = str.split("");

            int numberOfChar = 1;
            String newString = "";

            for (int k = 0; k < strArray.length; k++) {
                if (k != strArray.length-1 && strArray[k + 1].equals(strArray[k])) {
                    numberOfChar++;
                } else {
                    if (numberOfChar == 1) {
                        newString += strArray[k];
                        numberOfChar = 1;
                    }  else if (numberOfChar > 2) {
                        newString += strArray[k] + numberOfChar;
                        numberOfChar = 1;
                    }
                    else  {
                        newString += strArray[k];
                        newString += strArray[k];
                        numberOfChar = 1;
                    }
                }
            }
            System.out.println(newString);
        }
    }
}
