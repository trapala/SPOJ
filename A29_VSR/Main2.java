// błędna odpowiedź
package latweA.Strona1.A29_VSR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //  Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine());

        for (int i = 0; i < tests; i++) {

            String[] line = br.readLine().split(" ");
            int v1 = Integer.parseInt(line[0]);
            int v2 = Integer.parseInt(line[1]);

            int wynik = (2 * v1 * v2) / (v1 + v2);

            StringBuilder sb = new StringBuilder();
            sb.append(wynik);

            System.out.println(sb);
        }
    }
}
//
/*prędkość średnia Vśr = Sc / tc   czyli     S1+S2 / (t1+t2)
 * przez podstawienie Vśr = 2V1V2  / V2+V1
 * https://brainly.pl/zadanie/2817550 */

/*
 * dla rozwiązania Java, Błąd Przekroczono limit czasu;
 * po prostu jawa się nie nadaje do programów o dużym wejściu/wyjściu-operacje wejścia/wyjścia są wolne,
 * możesz spróbować wczytać wszystko do stringu i samemu parsować wejście, a wyjście zrobić jako StringBuilder */
//