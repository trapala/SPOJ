/*
 * https://pl.spoj.com/problems/PP0504D/
 * Reprezentacja liczb typu float
 */

package A12_PP0504D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program obliczający reprezentację szesnastkową liczb typu float.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();

        List<Case> cases = new ArrayList<>();

        for (int i = 0; i < testCount; i++) {
            float number = scanner.nextFloat();
            cases.add(new Case(number));
        }

        for (Case testCase : cases) {
            System.out.println(testCase.getHexRepresentation());
        }
    }
}

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class Case {
    private final long bits;

    /**
     * Konstruktor klasy Case.
     *
     * @param number liczba zmiennoprzecinkowa typu float
     */
    public Case(float number) {
        this.bits = Float.floatToIntBits(number);
    }

    /**
     * Metoda zwracająca reprezentację szesnastkową liczby float.
     *
     * @return reprezentacja szesnastkowa liczby float
     */
    public String getHexRepresentation() {
        int k = (byte) (bits >> 24) & 0xff;
        int k2 = (byte) (bits >> 16) & 0xff;
        int k3 = (byte) (bits >> 8) & 0xff;
        int k4 = (byte) bits & 0xff;

        return Integer.toHexString(k) + " " + Integer.toHexString(k2) + " " +
                Integer.toHexString(k3) + " " + Integer.toHexString(k4);
    }
}

/*
 * Program wczytuje liczbę przypadków do rozważenia, a następnie dla każdego przypadku wczytuje pojedynczą liczbę zmiennoprzecinkową typu float.
 * Algorytm programu polega na obliczeniu reprezentacji szesnastkowej dla podanej liczby float.
 * Program wykorzystuje klasę Case, która służy do przechowywania danych dla poszczególnych przypadków testowych.
 * Metoda getHexRepresentation() wykonuje operację obliczania reprezentacji szesnastkowej liczby float.
 * Wynik dla każdego przypadku testowego jest wypisywany na standardowym wyjściu.
 */
