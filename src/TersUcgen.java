import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int basNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz :");
        basNum = input.nextInt();
        int i=basNum;
        int j;
        int k=basNum;

        for(;i>=1;i--){
            System.out.println(i);
            for(j=0;j<=basNum-i;j++){
                System.out.print(" ");
                }
            for(k=basNum;k>=1;k--) {
                System.out.print("*");
            }
        }

    }
}
