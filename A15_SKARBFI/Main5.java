// źródło github
package latweA.Strona1.A15_SKARBFI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main5 {

    public static void main(String[] args) throws IOException {

        int nbtest = 0, nbtips = 0,x =0 ,y = 0,direction = 0,nbsteps = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nbtest = Integer.parseInt(br.readLine());
        int tabx[] = new int[nbtest];
        int taby[] = new int[nbtest];
        for(int i  = 0;i < nbtest; i++)
        {

            nbtips = Integer.parseInt(br.readLine());
            x = 0;
            y = 0;
            for(int j = 0 ;j < nbtips; j++)
            {
                String line = br.readLine();
                String [] tab = line.split(" ");
                direction = Integer.parseInt(tab[0]);
                nbsteps = Integer.parseInt(tab[1]);
                if(direction==0)
                {
                    y=y+nbsteps;
                }
                else if(direction == 1)
                {
                    y=y-nbsteps;
                }
                else if(direction == 2)
                {
                    x=x-nbsteps;
                }
                else if(direction == 3)
                {
                    x=x+nbsteps;
                }
            }
            tabx[i]=x;
            taby[i]=y;


        }
        for(int i=0;i<nbtest;i++)
        {
            if (taby[i] < 0) {
                System.out.println("1 " + Math.abs(taby[i]));
            }
            if (taby[i] > 0) {
                System.out.println("0 " + taby[i]);
            }
            if (tabx[i] < 0) {
                System.out.println("2 " + Math.abs(tabx[i]));
            }
            if (tabx[i] > 0) {
                System.out.println("3 " + tabx[i]);
            }

            if (taby[i] == 0 && tabx[i] == 0) {
                System.out.println("studnia");
            }
        }
    }
}
