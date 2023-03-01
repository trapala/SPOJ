//
// https://pl.spoj.com/problems/FANGEN/
// Wiatraczki
//

package latweA.Strona1.A20_FANGEN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Kierunek {
    LEWO, PRAWO
}

interface ObslugaTablicy {
    public void Uzupelnij(char[][] tab);

    public void Wyswietl(char[][] tab);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kierunek kierunek;
        List<Integer> list = new ArrayList<Integer>();
        int r;

        do {
            r = scanner.nextInt();
            list.add(r);
        } while (r != 0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                kierunek = Kierunek.LEWO;
            } else {
                kierunek = Kierunek.PRAWO;
            }
            r = Math.abs(list.get(i));
            char[][] tab = new char[r * 2][r * 2];
            Wiatrak wiatrak = new Wiatrak();
            wiatrak.Uzupelnij(tab);
            wiatrak.Rysuj(tab, kierunek);
            wiatrak.Wyswietl(tab);
        }
    }
}

class Wiatrak implements ObslugaTablicy {
    public void Uzupelnij(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = '*';
            }
        }
    }

    public void Rysuj(char[][] tab, Kierunek kierunek) {
        for (int i = 0; i < (tab.length / 2) - 1; i++) {
            for (int j = i; j < tab.length - i - 1; j++) {
                if (kierunek == Kierunek.LEWO) {
                    if (j < (tab.length / 2) && j > i) {
                        tab[j][tab.length - i - 1] = '.';
                        tab[i][j] = '.';
                    } else if (j >= (tab.length / 2)) {
                        tab[j][i] = '.';
                        tab[tab.length - i - 1][j] = '.';
                    }
                }
                if (kierunek == Kierunek.PRAWO) {
                    if ((j < tab.length / 2) && j > i) {
                        tab[j][i] = '.';
                        tab[tab.length - i - 1][j] = '.';
                    } else if (j >= (tab.length / 2)) {
                        tab[j][tab.length - i - 1] = '.';
                        tab[i][j] = '.';
                    }
                }
            }
        }
    }

    public void Wyswietl(char[][] tab) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                sb.append(tab[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}