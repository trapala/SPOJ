package latweA.Strona1.A20_FANGEN_dobre.Main2;

public abstract class Fan {

    private static final String DOT = ".";
    private static final String STAR = "*";
    private int size;
    private int matrix;
    protected String[][] tab;

    public abstract void print();

    /*
     * metoda ustawia rozmiar wiatraka i wypelnia go
     * @return void
     */
    public void setup(int size) {

        this.size = size;

        fillStars();
        setDotUpperLeftPart();// upperLeft
        setDotUpperRightPart();// upperRight
        setDotBottomRightPart();// rightBottom
        setDotBottomLeftPart();// leftBottom
    }

    private void fillStars() {

        matrix = size * 2;
        tab = new String[matrix][matrix];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                (tab[i][j]) = STAR;
            }
        }
    }

    private void setDotBottomLeftPart() {

        for (int i = size; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                tab[i][j] = DOT;
            }
        }
    }

    private void setDotBottomRightPart() {

        for (int i = tab.length - 1; i > size; i--) {
            for (int j = i - 1; j > size - 1; j--) {
                tab[i][j] = DOT;
            }
        }
    }

    private void setDotUpperRightPart() {

        for (int i = 1; i < size; i++) {
            for (int j = tab.length - i; j < tab.length; j++) {
                tab[i][j] = DOT;
            }
        }
    }

    private void setDotUpperLeftPart() {

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < size; j++) {
                tab[i][j] = DOT;
            }
        }
    }
}