// źródło github
package latweA.Strona1.A04_FLAMASTE;

import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int numberOfCases = scaner.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            String stringToAnalize = scaner.next();
            String[] arrayStringToAnalize = stringToAnalize.split("");
            int value = 1;
            String rearrange = "";
            for (int k = 1; k < arrayStringToAnalize.length; k++) {

                if (arrayStringToAnalize[k].equals(arrayStringToAnalize[k - 1])) {
                    value = value + 1;
                } else {
                    if (value == 1) {
                        rearrange = rearrange + arrayStringToAnalize[k - 1];
                        value = 1;
                    } else if (value == 2) {
                        rearrange = rearrange + arrayStringToAnalize[k - 1] + arrayStringToAnalize[k - 1];
                        value = 1;
                    } else if (value > 2) {
                        rearrange = rearrange + arrayStringToAnalize[k - 1] + value;
                        value = 1;
                    }
                }
                if (k + 1 == arrayStringToAnalize.length) {
                    if (value == 1) {
                        rearrange = rearrange + arrayStringToAnalize[k];
                        value = 1;
                    } else if (value == 2) {
                        rearrange = rearrange + arrayStringToAnalize[k] + arrayStringToAnalize[k];
                        value = 1;
                    } else {
                        rearrange = rearrange + arrayStringToAnalize[k] + value;
                        value = 1;
                    }
                }
            }
            if (arrayStringToAnalize.length == 1) {
                rearrange = arrayStringToAnalize[0];
            }
            System.out.println(rearrange);
        }
    }
}