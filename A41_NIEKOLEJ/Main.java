//
// https://pl.spoj.com/problems/NIEKOLEJ/
// Niekolejne
// przekroczono limit czasu, odpowiedź zaakceptowana z Main2 (przepisane na C++)

package latweA.Strona1.A41_NIEKOLEJ;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        if (n == 1 || n == 2) {
            out.print("NIE");
        } else {

            for (int i = n - 1; i >= 0; i -= 2) {
                out.print(i + " ");
            }
            for (int i = n; i >= 0; i -= 2) {
                out.print(i + " ");
            }
        }
        out.flush();
        out.close();
    }
}