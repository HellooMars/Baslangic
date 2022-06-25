import java.util.Scanner;
public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :");
        n = input.nextInt();
        int x=n;
        for (int i = 1; i <=n; i++){
            for(int k = 1; k<=(n-i);k++){
                System.out.print(" ");
                }
            for(int m = 1; m <= (2*i)-1; m++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
