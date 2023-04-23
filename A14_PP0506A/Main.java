//
// https://pl.spoj.com/problems/PP0506A/
// Sort 1
//

package latweA.Strona1.A14_PP0506A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.pow;

class MyComp implements Comparable<MyComp> {
    private String nazwa;
    private int x;
    private int y;
    private double odleglosc;

    MyComp(String nazwa, int x, int y, double odleglosc) {
        this.nazwa = nazwa;
        this.x = x;
        this.y = y;
        this.odleglosc = odleglosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(MyComp o) {
        return Double.compare(this.odleglosc, o.odleglosc);
    }
}

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void List(ArrayList<MyComp> nowePunkty) {

        int ilePunktow = scanner.nextInt();
        for (int j = 0; j < ilePunktow; j++) {
            String nazwa = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            double odleglosc = Math.sqrt(pow(x, 2) + pow(y, 2));

            nowePunkty.add(new MyComp(nazwa, x, y, odleglosc));
        }
    }

    public static void main(String[] args) {

        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
            ArrayList<MyComp> punkty = new ArrayList<>();
            List(punkty);
            Collections.sort(punkty);

            for (MyComp myComp : punkty) {
                System.out.println(myComp.getNazwa() + " " + myComp.getX() + " " + myComp.getY());
                System.out.println();
            }
        }
    }
}