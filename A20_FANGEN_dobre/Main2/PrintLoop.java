package latweA.Strona1.A20_FANGEN_dobre.Main2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLoop {

    private int[] values;
    private FanFactory fanFactory;
    private BufferedReader reading;

    /*
     * @param fanFactory zwraca obiekty fan
     * @param length okresla dlugosc petli w metodzie run
     *
     */
    public PrintLoop(FanFactory fanFactory, int[] length) {

        this.fanFactory = fanFactory;
        this.values = length;
    }

    /*
     * metoda run uruchamia petle wczytywania i drukowania
     * @param void
     * @return void
     */
    public void run() throws NumberFormatException, IOException {

        reading = new BufferedReader(new InputStreamReader(System.in));

        Fan leftFan = fanFactory.getFan("LEFT");
        Fan rightFan = fanFactory.getFan("RIGHT");

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(reading.readLine());

            if (values[i] == 0) {
                for (int j = 0; j < values.length; j++) {

                    if (values[j] == 0) {
                        System.exit(0);

                    } else if (values[j] < 0) {
                        int v = (values[j] * -1);
                        leftFan.setup(v);
                        leftFan.print();
                        System.out.println("");

                    } else {
                        rightFan.setup(values[j]);
                        rightFan.print();
                        System.out.println("");
                    }
                }
                System.exit(0);
            }
        }
    }
}