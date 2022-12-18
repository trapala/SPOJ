//
// https://pl.spoj.com/problems/BFN1/
// Zabawne Dodawanie Piotrusia
//
package latweA.Strona1.A07_BFN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tests; i++) {

            int number = scanner.nextInt();
            scanner.nextLine();

            int suma = 0;
            int count = 0;

            if (number == reverse(number)) {
                suma += number;
                count = 0;
            } else {
                suma += number + reverse(number);
                count++;
            }

            while (suma != reverse(suma)) {

                suma += reverse(suma);
                count++;
            }

        System.out.println(suma + " " + count);
    }
}

    static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
