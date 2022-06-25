import java.util.Scanner;
public class IkininKuvvetleri {
    public static void main(String[] args) {
        int i=1,x;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz :");
        x = input.nextInt();

        for(i =1; i<=x; i*=4) {
            System.out.print(i + ",");
        }
        System.out.println();
            for(i=1; i<x; i*=5){
                System.out.print( i+",");
            }

    }
}
