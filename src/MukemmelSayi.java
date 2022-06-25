import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int num, total=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        num = input.nextInt();

        for(int i=1;i<num;i++) {
             if(num % i == 0) {
                 total += i;
             }
        }if(total== num){
            System.out.println(num +"Mükemmel sayıdır.");
        }else{
            System.out.println(num +"Mükemmel sayı değildir.");
        }
    }
}
