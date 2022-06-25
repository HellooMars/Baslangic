import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        double n, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        n = input.nextInt();
        double x =n;

        for(n=1; n <= x; n++){
            result += (1/n);
        }
        System.out.println(result);
    }
}
