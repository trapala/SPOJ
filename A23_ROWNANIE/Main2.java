// źródło github
// błędna odpowiedź
package latweA.Strona1.A23_ROWNANIE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 { // spoj blad
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pierwiastki = new ArrayList<>();

        try {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");

                float A = Float.parseFloat(line[0]);
                float B = Float.parseFloat(line[1]);
                float C = Float.parseFloat(line[2]);

                double delta = Math.pow(B, 2) - (4 * A * C);
                pierwiastki.add(result(delta));


            }
        } catch (NumberFormatException e) {
            for (int x : pierwiastki)
                System.out.println(x);
        }

        scanner.close();
    }

    public static int result(double delta) {

        int number;
        if (delta > 0) {
            number = 2;
        } else if (delta == 0) {
            number = 1;
        } else {
            number = 0;
        }
        return number;
    }
}
