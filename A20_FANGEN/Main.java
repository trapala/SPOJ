/*
 * https://pl.spoj.com/problems/FANGEN/
 * Wiatraczki
 */

package A20_FANGEN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa reprezentująca kierunek wiatraczka.
 */
enum Kierunek {
    LEWO, PRAWO
}

/**
 * Program generuje wiatraczki o różnych rozmiarach.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kierunek kierunek;
        List<Integer> list = new ArrayList<>();
        int r;

        do {
            r = scanner.nextInt();
            list.add(r);
        } while (r != 0);

        for (Integer integer : list) {
            if (integer > 0) {
                kierunek = Kierunek.LEWO;
            } else {
                kierunek = Kierunek.PRAWO;
            }
            r = Math.abs(integer);
            char[][] tab = new char[r * 2][r * 2];
            Wiatrak wiatrak = new Wiatrak();
            wiatrak.Uzupelnij(tab);
            wiatrak.Rysuj(tab, kierunek);
            wiatrak.Wyswietl(tab);
        }
    }
}

/**
 * Klasa generująca wiatraczki.
 */
class Wiatrak {
    /**
     * Metoda do wypełniania tablicy gwiazdkami.
     *
     * @param tab Tablica znaków
     */
    public void Uzupelnij(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = '*';
            }
        }
    }

    /**
     * Metoda do rysowania wiatraczka.
     *
     * @param tab      Tablica znaków
     * @param kierunek Kierunek wiatraczka
     */
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

    /**
     * Metoda wyświetla zawartość tablicy znaków.
     *
     * @param tab Tablica znaków, która zostanie wyświetlona.
     */
    public void Wyswietl(char[][] tab) {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : tab) {
            for (int j = 0; j < tab.length; j++) {
                sb.append(chars[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/*
 * Program generuje wiatraczki o różnych rozmiarach na podstawie podanych danych wejściowych.
 * Algorytm polega na wypełnieniu tablicy znakami '*' oraz rysowaniu wiatraczka w zależności od określonego kierunku.
 * Klasa Wiatrak jest odpowiedzialna za generowanie wiatraczków. Metoda Uzupelnij() wypełnia tablicę znakami '*',
 * metoda Rysuj() rysuje wiatraczek na tablicy zgodnie z określonym kierunkiem,
 * a metoda Wyswietl() wyświetla zawartość tablicy znaków.
 * Wynik jest wyświetlany na standardowym wyjściu.
 */