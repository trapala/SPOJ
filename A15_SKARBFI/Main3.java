// źródło github
package latweA.Strona1.A15_SKARBFI;

import java.util.Scanner;

public class Main3 { // accepted
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int[] tipsSummary = new int[4];
        int numberOfCases = scaner.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            //tipsSummary = {0,0,0,0};
            tipsSummary[0] = 0;
            tipsSummary[1] = 0;
            tipsSummary[2] = 0;
            tipsSummary[3] = 0;
            int vauleOfTips = scaner.nextInt();
            int[] tips = new int[vauleOfTips * 2];
            for (int k = 0; k < vauleOfTips * 2; k += 2) {
                tips[k] = scaner.nextInt();
                tips[k + 1] = scaner.nextInt();
            }

            for (int k = 0; k < tips.length; k += 2) {
                switch (tips[k]) {
                    case 0:
                        tipsSummary[0] = tipsSummary[0] + tips[k + 1];
                        break;
                    case 1:
                        tipsSummary[1] = tipsSummary[1] + tips[k + 1];
                        break;
                    case 2:
                        tipsSummary[2] = tipsSummary[2] + tips[k + 1];
                        break;
                    case 3:
                        tipsSummary[3] = tipsSummary[3] + tips[k + 1];
                        break;
                }
            }

            if (tipsSummary[0] > tipsSummary[1]) {
                System.out.println("0 " + (tipsSummary[0] - tipsSummary[1]));
            } else if (tipsSummary[0] < tipsSummary[1]) {
                System.out.println("1 " + (tipsSummary[1] - tipsSummary[0]));
            }
            if (tipsSummary[2] > tipsSummary[3]) {
                System.out.println("2 " + (tipsSummary[2] - tipsSummary[3]));
            } else if (tipsSummary[2] < tipsSummary[3]) {
                System.out.println("3 " + (tipsSummary[3] - tipsSummary[2]));
            }
            if (tipsSummary[0] == tipsSummary[1] && tipsSummary[2] == tipsSummary[3]) {
                System.out.println("studnia");
            }
        }
    }
}
