// źródło github
package latweA.Strona1.A14_PP0506A;

import java.util.*;
import java.lang.*;
import static java.lang.Math.pow;
import java.util.Scanner;


class Punkt implements Comparable<Punkt>
{
    private String nazwa;
    private int a;
    private int b;
    private double odleglosc;

    public Punkt() { }

    public Punkt(String nazwa, int a, int b, double odleglosc) {
        this.nazwa = nazwa;
        this.a = a;
        this.b = b;
        this.odleglosc = odleglosc;}

    public String getNazwa() {
        return nazwa; }

    public int getA() {
        return a; }

    public int getB() {
        return b; }

    public double getOdleglosc() {
        return odleglosc; }

    public int compareTo(Punkt o) {
        return Double.compare(this.odleglosc, o.odleglosc); }
}


public class Main2
{
    public static Scanner wpisz = new Scanner(System.in);

    public static void fillList(List<Punkt> nowePunkty)
    {
        int ilePunktow = wpisz.nextInt();
        for (int j = 0; j < ilePunktow; j++) {
            String n = wpisz.next();
            int x = wpisz.nextInt();
            int y = wpisz.nextInt();
            double odleglosc = Math.sqrt(pow(x, 2) + pow(y, 2));

            nowePunkty.add(new Punkt(n, x, y, odleglosc));
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        try
        {
            int ile = wpisz.nextInt();

            for (int i = 0; i < ile; i++)
            {
                List<Punkt> punkty = new ArrayList<>();
                fillList(punkty);

                Collections.sort(punkty);

                for (int j = 0; j < punkty.size(); j++)
                {
                    System.out.println(punkty.get(j).getNazwa() + " " + punkty.get(j).getA() + " " + punkty.get(j).getB());
                    System.out.println();
                }
            }
        }
        finally
        {
            return;
        }
    }
}
