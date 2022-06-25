import java.util.Scanner;
public class ObebOkekFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int num1 = input.nextInt();

        System.out.print("2.Sayıyı giriniz :");
        int num2 = input.nextInt();
        int ekok;

        for( int i =1; i<= num1 * num2 ; i++){
            if( i % num1 ==0 && i % num2 ==0){
                System.out.println(i);
                break;
            }
        }

        /*
        int ebob =1;


        for(int i = 1; i <= num1; i++){
            if(num1 % i ==0 && num2 % i ==0){
               ebob = i;
            }
        }
        System.out.println(ebob);
         */


    }
}
