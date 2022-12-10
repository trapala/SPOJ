// źródło github

package latweA.Strona1.A20_FANGEN_dobre.Main2;

import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        int[] length = new int[100];
        FanFactory fanFactory = new FanFactory();
        PrintLoop printLoop = new PrintLoop(fanFactory, length);
        printLoop.run();
    }
}