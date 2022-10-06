import java.util.Random;
import java.util.Scanner;

public class MineSweeper {


    static void table(int a, int b) {
        int mines = (a * b) / 4;
        int[][] arr = new int[a][b];
        Random rand = new Random();
        int randomnum1 = rand.nextInt(a);
        int randomnum2 = rand.nextInt(b);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (randomnum1 == i && randomnum2 == j) {
                    System.out.println("* ");
                }
            }
            System.out.println("");

        }
    }


    static void minesTable(int a, int b) {
        int mines = (a * b) / 4;
        int[][] arr = new int[a][b];
        Random rand = new Random();
        int count =0;
        int randomnum1 = rand.nextInt(a);
        int randomnum2 = rand.nextInt(b);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                    if (randomnum1 == i && randomnum2 == j) {
                        System.out.println("* ");
                        count++;
                    }
                    System.out.print("- ");
                }
                System.out.println("");
        }
    }
}
