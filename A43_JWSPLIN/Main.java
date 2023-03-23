//
// https://pl.spoj.com/problems/JWSPLIN/
// Współliniowość punktów
// przekroczono limit czasu
package latweA.Strona1.A43_JWSPLIN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine());
        double lewaStrona;
        double prawaStrona;

        while (t > 0) {
            String[] line = in.readLine().split("\\t");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);
            int x3 = Integer.parseInt(line[4]);
            int y3 = Integer.parseInt(line[5]);
            
            lewaStrona = (x2 - x1) * (y3 - y1);

            prawaStrona = (y2 - y1) * (x3 - x1);

            if (lewaStrona == prawaStrona) {
                out.print("TAK");
            } else {
                out.print("NIE");
            }
            out.flush();
            out.close();

            t--;
        }
    }
}