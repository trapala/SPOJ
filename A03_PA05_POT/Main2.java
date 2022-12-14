// źródło github
package latweA.Strona1.A03_PA05_POT;

import java.math.BigInteger;
import java.util.Scanner;


    public class Main2 {
        public static void main(String[] args) {
            StringBuilder result = new StringBuilder();

            Scanner scanner = new Scanner(System.in);
            int tests = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i < tests; i++) {
                String[] line = scanner.nextLine().split(" ");
                double lastDigit = new BigInteger(line[0]).mod(new BigInteger("10")).doubleValue();
                System.out.println("LastDigit: " + lastDigit);
                double power = new BigInteger(line[1]).mod(new BigInteger("4")).doubleValue() + 4;
                System.out.println("Power: " + power);
                double resultLastDigit = Math.pow(lastDigit, power) % 10;

                result.append((int)resultLastDigit).append("\n");
            }

            System.out.println(result.toString());
        }
    }

