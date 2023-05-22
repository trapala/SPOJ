/*
 https://pl.spoj.com/problems/FLAMASTE
 Flamaster
 */

package A04_FLAMASTE;

import java.util.Scanner;

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