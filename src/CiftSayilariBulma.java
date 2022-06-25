import java.util.Scanner;
public class CiftSayilariBulma {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        x = input.nextInt();
        for(int i = 1; i <= x;i += 1){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                continue;
            }
        }
    }
}
