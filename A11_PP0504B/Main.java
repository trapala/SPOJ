/*
 * https://pl.spoj.com/problems/PP0504B/
 * StringMerge
 */

package A11_PP0504B;

import java.util.Scanner;

/**
 * Klasa reprezentująca pojedynczy przypadek testowy.
 */
class TestCase {
    private final String str1;
    private final String str2;

    /**
     * Konstruktor klasy TestCase.
     *
     * @param str1 Pierwszy łańcuch znaków.
     * @param str2 Drugi łańcuch znaków.
     */
    public TestCase(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }
}

/**
 * Program wykonuje scalanie dwóch łańcuchów znaków.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt(); // liczba testów

        // Przygotowanie tablicy przypadków testowych
        TestCase[] testCases = new TestCase[testCount];
        scanner.nextLine(); // Pominięcie nowej linii po wczytaniu liczby testów
        for (int i = 0; i < testCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            String str1 = input[0];
            String str2 = input[1];
            testCases[i] = new TestCase(str1, str2);
        }

        // Wykonanie i wypisanie wyników
        for (TestCase testCase : testCases) {
            String result = stringMerge(testCase.getStr1(), testCase.getStr2());
            System.out.println(result);
        }

        scanner.close();
    }

    /**
     * Metoda łącząca na przemian dwa łańcuchy znaków.
     *
     * @param str1 pierwszy łańcuch znaków
     * @param str2 drugi łańcuch znaków
     * @return złączony łańcuch znaków
     */
    public static String stringMerge(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder merged = new StringBuilder();

        // Złączanie znaków na przemian
        for (int i = 0; i < minLength; i++) {
            merged.append(str1.charAt(i));
            merged.append(str2.charAt(i));
        }

        return merged.toString();
    }
}

/*
 * Program wczytuje liczbę przypadków do rozważenia, a następnie dla każdego przypadku wczytuje parę łańcuchów znaków.
 * Algorytm programu polega na złączeniu ze sobą dwóch łańcuchów znaków, biorąc na przemian po jednym znaku z każdego łańcucha.
 * Program wykorzystuje klasę TestCase, która służy do przechowywania danych dla poszczególnych przypadków testowych.
 * Metoda stringMerge wykonuje operację scalenia dwóch łańcuchów znaków.
 * Wynik dla każdego przypadku testowego jest wypisywany na standardowym wyjściu.
 */