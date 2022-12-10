// źródło github
package latweA.Strona1.A26_CALC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 { // błąd
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma =0;
        List<Integer> data = new ArrayList<>();

        try {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(" ");

                int a = Integer.parseInt(line[1]);
                int b = Integer.parseInt(line[2]);

                switch (line[0]) {
                    case "+":
                        suma = a + b;
                        break;
                    case "-":
                        suma = a - b;
                        break;
                    case "*":
                        suma = a * b;
                        break;
                    case "/":
                        suma = a / b;
                        break;
                    case "%":
                        suma = a % b;
                        break;
                    default:
                        for (int x : data)
                            System.out.println(x);
                        return;
                }
                data.add(suma);

                System.out.println(data);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int x : data)
                System.out.println(x);
        }
    }
}
