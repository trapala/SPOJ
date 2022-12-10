// źródło github
package latweA.Strona1.A15_SKARBFI;

import java.util.Scanner;

public class Main4 {
    // https://pl.spoj.com/problems/SKARBFI/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max=50,min=0;
        int sets = scanner.nextInt();

        if(sets > min && sets <= max){
            for(int i = 0; i < sets; i++){
                PathFinder pathFinder = new PathFinder(scanner);
                int[] result = pathFinder.findTreasure();
                showResult(result);
            }
        }

    }
    private static void showResult(int[] result){
        int x = result[0];
        int y = result[1];

        if (x == 0 && y == 0) {
            System.out.println("studnia");
        } else {
            if (y > 0) {
                System.out.println("0 " + y);
            } else if(y<0){
                System.out.println("1 " + -y);
            }
        }
        if (x != 0) {
            if (x >= 0) {
                System.out.println("3 " + x);
            } else {
                System.out.println("2 " + -x);
            }
        }
    }

    public static class PathFinder {

        private int x;
        private int y;
        private Scanner scanner;

        public PathFinder(Scanner scanner){
            this.x = 0;
            this.y = 0;
            this.scanner = scanner;
        }

        public int[] findTreasure(){
            int leads = scanner.nextInt();
            if(leads > 0 && leads <= 100000){
                for(int j = 0; j < leads; j++){
                    int direction = scanner.nextInt();
                    int step = scanner.nextInt();
                    makeMove(direction, step);
                }
            }
            return new int[]{this.x,this.y};
        }

        private void makeMove(int direction, int step){
            switch (direction) {
                case 0:
                    y += step;
                    break;
                case 1:
                    y -= step;
                    break;
                case 2:
                    x -= step;
                    break;
                case 3:
                    x += step;
                    break;
            }
        }
    }
}
