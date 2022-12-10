// źródło github
package latweA.Strona1.A32_PP0601A2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean prevNumber = true;

        while (scanner.hasNext()) {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number);
            if (number == 42) {
                if (!prevNumber) {
                    count++;
                    prevNumber = true;
                }
                if (count == 3) {
                    return;
                }
            } else {
                prevNumber = false;
            }
        }
    }
}
