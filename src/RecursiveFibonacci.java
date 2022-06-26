import java.util.Scanner;
public class RecursiveFibonacci {
    static int fibonacci(int x){
        int num =x;
        if(x==2 || x==1){
            return 1;
        }
        return fibonacci(x-1)+fibonacci(x-2);

    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Derecesini bilmek istediğiniz sayıyı giriniz :");
        num = input.nextInt();
        for(int i=1;i<=num;i++) {
            System.out.print(fibonacci(i));
            System.out.print(" ");
        }


    }
}
