// źródło github
package latweA.Strona1.A22_SUMA;

import java.util.Scanner;

public class Main2 { //spoj blad
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getRandomInteger(10,1);
        System.out.println("n: " + n);

        int[] array = new int[n];
        while(n > 0){
            for (int i = 0; i<n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i<n; i++) {
                Suma.add(array[i]);
            }
            n--;
        }
    }
    public static class Suma {
        static int result = 0;

        public static void add(int n) {
            result += n;
            System.out.println(result);
        }
    }

    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}
