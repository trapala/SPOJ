// źródło github
package latweA.Strona1.A40_MWPZ06H;

import java.util.*;

public class Main2 {

    public static void sortuj(int[] tab) {
        int[] temp = tab;
        Arrays.sort(temp);
        int maks = temp[temp.length-1];
        int licznik = 0;
        for(int i=0; i<temp.length; i++)
            if(temp[i] == maks)
                licznik++;
        String tmp = "";
        for(int a=0; a<licznik; a++)
            tmp = tmp + maks + " ";
        for(int b=0; b<temp.length-licznik; b++)
            tmp = tmp + temp[b] + " ";
        System.out.println(tmp);    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            int y = scanner.nextInt();
            int[] tab = new int[y];
            for(int j=0; j<y; j++)
                tab[j] = scanner.nextInt();
            sortuj(tab);        }
    }
}