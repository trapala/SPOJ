//
// https://pl.spoj.com/problems/PP0601A2/
// Test 3
//
package latweA.Strona1.A32_PP0601A2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 42;
        int count = 3;
        int b;

        while (scanner.hasNext()) {
            b = a;
            a = Integer.parseInt(scanner.nextLine());

            if(a == 42 && b !=42){
                count--;
            }

            System.out.println(a);
            if(count == 0){
                return;
            }
        }
    }
}
