/*
 * https://pl.spoj.com/problems/TRN/
 * Transponowanie macierzy
 */

package A33_TRN;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    private static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;

        private Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        private int nextInt() throws IOException {
            int num = 0;
            byte c = read();
            while (c <= 32) c = read();
            do {
                num = num * 10 + c - 48;
            } while ((c = read()) >= 48 && c <= 57);
            return num;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }
    }

    public static void main(String[] args) throws IOException {
        Main.Reader rd = new Main.Reader();
        int r = rd.nextInt();
        int c = rd.nextInt();

        int[][] tab = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                tab[i][j] = rd.nextInt();
            }
        }

        for (int i = 0; i < tab[0].length; i++) { // do ilości elementów w wierszu o indeksie 0
            for (int[] ints : tab) { // do ilości kolumn
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }
}