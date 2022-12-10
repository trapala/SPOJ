package latweA.Strona1.A20_FANGEN_dobre.Main2;

public class LeftRotationFan extends Fan {

    /*
     * drukuje wiatrak lewoskretny
     *
     * @return void
     *
     * @see Fan#print()
     */
    @Override
    public void print() {

        int revert;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                revert = (tab.length - 1) - i;
                System.out.print(tab[revert][j]);
            }
            System.out.println("");
        }
    }
}