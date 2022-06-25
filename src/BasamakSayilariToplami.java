import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int x, basValue, result=1;
        Scanner input =new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        x = input.nextInt();

        while(x !=0){
            basValue= x % 10;
            result += basValue;
            x =x / 10;
        }
        result-=1;
        System.out.println(result);
    }
}
