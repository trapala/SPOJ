//
// https://pl.spoj.com/problems/VSR/
// Prędkość średnia
//

package latweA.Strona1.A29_VSR;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        private Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
            int num = 0;
            byte c = read();
            while (c <= ' ') c = read();
            do {
                num = num * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
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
        OutputStream out = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();

        int tests = rd.nextInt();
        for (int i = 0; i < tests; i++) {
            int v1 = rd.nextInt();
            int v2 = rd.nextInt();

            int wynik = (2 * v1 * v2) / (v1 + v2);
            sb.append(wynik).append("\n");
        }

        out.write(sb.toString().getBytes());
        out.flush();
    }
}