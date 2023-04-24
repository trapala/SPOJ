//
// https://pl.spoj.com/problems/SKARBFI/
// SkarbFinder
//

package latweA.Strona1.A15_SKARBFI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        int[] tabX = new int[tests];
        int[] tabY = new int[tests];

        for (int i = 0; i < tests; i++) {
            int x = 0; // wschod-zachod
            int y = 0; // polnoc-poludnie

            int ilePar = scanner.nextInt();
            for (int j = 0; j < ilePar; j++) {
                int kierunek = scanner.nextInt();
                int odleglosc = scanner.nextInt();

                if (kierunek == 0) // polnoc
                    y += odleglosc;
                else if (kierunek == 1) // poludnie
                    y -= odleglosc;
                else if (kierunek == 2) // zachod
                    x -= odleglosc;
                else if (kierunek == 3) // wschod
                    x += odleglosc;
            }
            tabX[i] = x;
            tabY[i] = y;
        }

        for (int i = 0; i < tests; i++) {
            if (tabY[i] < 0)
                System.out.println("1 " + Math.abs(tabY[i]));
            if (tabY[i] > 0)
                System.out.println("0 " + tabY[i]);
            if (tabX[i] < 0)
                System.out.println("2 " + Math.abs(tabX[i]));
            if (tabX[i] > 0)
                System.out.println("3 " + tabX[i]);
            if (tabY[i] == 0 && tabX[i] == 0)
                System.out.println("studnia");
        }
    }
}