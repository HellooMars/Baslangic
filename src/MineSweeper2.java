import java.util.Random;

public class MineSweeper2 {



    static void table(int a, int b) {

        int [][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
    static void minesTable(int a, int b) {
            int mines = (a * b) / 4;

            Random rand = new Random();

            int [][] arr = new int[a][b];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("- ");
                }
                System.out.println("");
            }
            for(int i=0;i<=mines-1;i++){
                int randomnum = rand.nextInt(a);
                int randomnum2 = rand.nextInt(b);
                arr [a][b] = Integer.parseInt("*");
                    }
                }
            }

