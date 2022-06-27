import java.util.Scanner;
public class RecursiveUsAlma {
    static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b;i++){
            if(b==0){
            return 1;}
            result *=a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Taban değerini giriniz :");
            a = scan.nextInt();
            System.out.print("Üs değerini giriniz :");
            b = scan.nextInt();
            System.out.println("Sonuç :" + power(a, b));
        }while(false);
    }
}
