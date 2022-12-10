//
// https://pl.spoj.com/problems/PP0604A/
// Średnia arytmetyczna
//
package latweA.Strona1.A36_PP0604A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        int suma;
        double sredia;
        double wartosc;
        double najnizsza;
        int wynik = 0;

        while (t > 0) {
            suma = 0;
            najnizsza= 100;

            int ileLiczb = scanner.nextInt();

            int[] tablica = new int[ileLiczb];
            for (int i = 0; i < ileLiczb; i++) {
                tablica[i] = scanner.nextInt();
                suma += tablica[i];
            }

            sredia = (double) suma / ileLiczb;

            for (int i = 0; i < ileLiczb; i++){

                wartosc = Math.abs(tablica[i] - sredia);
                if (wartosc == najnizsza) {
                    continue;
                }
                if (wartosc < najnizsza) {
                    najnizsza = wartosc;
                    wynik = tablica[i];
                }
            }
            System.out.println(wynik);
                t--;
        }
    }
}
