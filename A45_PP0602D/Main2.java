// źródło github
package latweA.Strona1.A45_PP0602D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] numbers = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<String> numberList = Arrays.asList(numbers);

        Collections.rotate(numberList, -k);

        for (String number : numberList) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}