//
// https://pl.spoj.com/problems/JLITOSL/
// Liczba na słowo
// Przekroczono limit czasu, wolne wejście-wyjście

package latweA.Strona1.A49_JLITOSL_przekroczenieCzasu;

import java.util.Scanner;

public class Main {

    private static final String[] jednosci = {"", " jeden", " dwa", " trzy", " cztery", " piec", " szesc", " siedem", " osiem", " dziewiec"};
    private static final String[] nascie = {"dziesiec", " jedenascie", " dwanascie", " trzynascie", " czternascie", " pietnascie", " szesnascie", " siedemnascie", " osiemnascie", " dziewietnascie"};
    private static final String[] dziesiatki = {"", " dziesiec", " dwadziescia", " trzydziesci", " czterdziesci", " piecdziesiat", " szescdziesiat", " siedemdziesiat", " osiemdziesiat", " dziewiecdziesiat"};
    private static final String[] setki = {"", " sto", " dwiescie", " trzysta", " czterysta", " piecset", " szescset", " siedemset", " osiemset", " dziewiecset"};
    private static final String[] x = {"", " tys.", " mln.", " mld.", " bln.", " bld."};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < tests; i++) {

            StringBuilder slownie = new StringBuilder(" ");
            int liczba, koncowka;
            int rzad = 0;
            int j = 0;

            liczba = scanner.nextInt();

            while (liczba > 0) {
                koncowka = (liczba % 10);
                liczba /= 10;
                if ((j == 0) && (liczba % 100 != 0 || koncowka != 0)) {
                    slownie.insert(0, x[rzad]);
                }
                if ((j == 0) && (liczba % 10 != 1)) {
                    slownie.insert(0, jednosci[koncowka]);
                }
                if ((j == 0) && (liczba % 10 == 1)) {
                    slownie.insert(0, nascie[koncowka]);
                    liczba /= 10;
                    j += 2;
                    continue;
                }
                if (j == 1) {
                    slownie.insert(0, dziesiatki[koncowka]);
                }
                if (j == 2) {
                    slownie.insert(0, setki[koncowka]);
                    j = -1;
                    rzad++;
                }
                j++;
            }
            System.out.println(slownie);
        }
    }
}