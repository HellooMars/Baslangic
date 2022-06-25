import java.util.Scanner;
public class ForAndWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        /*
        for( boolean run =true; run ==true;){
            System.out.println("Sayı giriniz");
            number = input.nextInt();
            if(number<0){
                run = false;
            }
        }

         */
        do{
            System.out.println("Sayı giriniz :");
            number = input.nextInt();
        }
        while(number >0);

    }
}
