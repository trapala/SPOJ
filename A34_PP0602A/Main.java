//
// https://pl.spoj.com/problems/PP0602A/
// Parzyste nieparzyste
//
package latweA.Strona1.A34_PP0602A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t > 0) {
            String[] line = scanner.nextLine().split(" ");
            int ileLiczb = Integer.parseInt(line[0]);
            List<Integer> listaParzyste = new ArrayList<>();
            List<Integer> listaNieParzyste = new ArrayList<>();
            List<Integer> lista = new ArrayList<>();

            int[] liczby = new int[ileLiczb];
            for (int i = 0; i < ileLiczb; i++) {
                liczby[i] = Integer.parseInt(line[i + 1]);

                if (i % 2 == 1) {
                    listaParzyste.add(liczby[i]);
                } else {
                    listaNieParzyste.add(liczby[i]);
                }
            }

            lista.addAll(listaParzyste);
            lista.addAll(listaNieParzyste);

            for (int e : lista) {
                System.out.print(e + " ");
            }

            listaParzyste.clear();
            listaNieParzyste.clear();
            lista.clear();

            t--;
        }
    }
}
