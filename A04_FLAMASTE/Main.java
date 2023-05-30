/*
 * https://pl.spoj.com/problems/FLAMASTE
 * Flamaster
 */

package A04_FLAMASTE;

import java.util.Scanner;

/**
 * Program kompresuje ciąg znaków poprzez zamianę kolejnych powtarzających się liter na literę oraz liczbę ich powtórzeń.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCount = scanner.nextInt();
        scanner.nextLine(); // Pominięcie znaku nowej linii

        for (int i = 0; i < testCount; i++) {
            String word = scanner.nextLine();
            String compressedWord = compressWord(word);
            System.out.println(compressedWord);
        }
    }

    /**
     * Kompresuje słowo, zastępując kolejne powtarzające się znaki znakiem, po którym następuje liczba.
     *
     * @param word słowo wejściowe
     * @return skompresowane słowo
     */
    private static String compressWord(String word) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && word.charAt(i + 1) == word.charAt(i)) {
                count++;
            } else {
                compressed.append(word.charAt(i));
                if (count > 2) {
                    compressed.append(count);
                } else if (count == 2) {
                    compressed.append(word.charAt(i));
                }
                count = 1;
            }
        }

        return compressed.toString();
    }
}

/*
 * Program wczytuje liczbę testów, a następnie dla każdego testu wczytuje ciąg znaków.
 * Algorytm polega na kompresowaniu ciągu znaków poprzez zamianę kolejnych powtarzających się liter na literę oraz liczbę ich powtórzeń.
 * Program wykorzystuje metodę compressWord, która przyjmuje słowo wejściowe i zwraca skompresowane słowo.
 * W metodzie compressWord, na podstawie podanego słowa, iteruje się po jego znakach, zliczając powtarzające się znaki.
 * Gdy napotkany znak jest inny od poprzedniego, aktualne zliczenie i odpowiednie znaki są dołączane do skompresowanego słowa.
 * Jeśli liczba powtórzeń danego znaku wynosi 2 lub więcej, dodawana jest również sama litera.
 * Ostatecznie, skompresowane słowo jest zwracane jako wynik. Kompresowane słowo jest wyświetlane na standardowym wyjściu.
 */