//
// https://pl.spoj.com/problems/JZLICZ/
// Zliczacz liter
//

package latweA.Strona1.A44_JZLICZ;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = "";

        int t = scanner.nextInt();
        scanner.nextLine();
        TreeMap<Character, Integer> tmLower = new TreeMap<>();
        TreeMap<Character, Integer> tmUpper = new TreeMap<>();


        for (int i = 0; i < t; i++) {
            tekst = tekst + scanner.nextLine().replace(" ", "");

            char[] charArray = tekst.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                int count = 0;
                for (int k = 0; k < charArray.length; k++) {
                    if (charArray[j] == charArray[k]) {
                        count++;
                    }
                }
                if (Character.isLowerCase(charArray[j])) {
                    tmLower.put(charArray[j], count);
                }
                if (Character.isUpperCase(charArray[j])) {
                    tmUpper.put(charArray[j], count);
                }
            }
        }

        Set<Map.Entry<Character, Integer>> setLower = tmLower.entrySet();
        for (Map.Entry<Character, Integer> me : setLower) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
        Set<Map.Entry<Character, Integer>> setUpper = tmUpper.entrySet();
        for (Map.Entry<Character, Integer> me : setUpper) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}