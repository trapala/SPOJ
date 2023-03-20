//
// https://pl.spoj.com/problems/MWPZ06H/
// Konkurs pseudomatematyczny
//

package latweA.Strona1.A40_MWPZ06H;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int ileLiczb = scanner.nextInt();
            scanner.nextLine();

            int[] tablica = new int[ileLiczb];
            for (int i = 0; i < ileLiczb; i++) {
                tablica[i] = scanner.nextInt();
            }
            sortuj(tablica);
            t--;
        }
    }

    public static void sortuj(int[] tablica) {
        Arrays.sort(tablica);
        int maks = tablica[tablica.length - 1]; // zapisujemy największą liczbę z tablicy
        int licznik = 0;

        for (int j : tablica) { // sprawdzamy w tablicy ile razy występuje największa liczba
            if (j == maks) {
                licznik++; // liczymy ilość wystąpień maksymalnej liczby
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < licznik; a++) { // zależnie od ilości wystąpień maksymalnej liczby w tablicy
            sb.append(maks).append(" "); // dodajemy wartość maksymalną na początku łańcucha
        }
        for (int b = 0; b < tablica.length - licznik; b++) { // dla reszty liczb z tablicy
            sb.append(tablica[b]).append(" "); // dodajemy kolejne wartości liczb do łańcucha
        }
        System.out.println(sb); // zwracamy łańcuch
    }
}