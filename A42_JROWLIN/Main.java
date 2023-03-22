//
// https://pl.spoj.com/problems/JROWLIN/
// Równanie liniowe
//

package latweA.Strona1.A42_JROWLIN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        final DecimalFormat df = new DecimalFormat("0.00");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(System.out);

        String[] line = in.readLine().split(" ");

        double a = Double.parseDouble(line[0]);
        double b = Double.parseDouble(line[1]);
        double c = Double.parseDouble(line[2]);
        double x;

        if (a != 0) {
            x = (c - b) / a;
            out.print(df.format(x));
        } else if (c - b != 0) {
            out.print("BR");
        } else {
            out.print("NWR");
        }

        out.flush();
        out.close();
    }
}