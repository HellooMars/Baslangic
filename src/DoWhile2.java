import java.util.Scanner;
public class DoWhile2 {
    public static void main(String[] args) {
        int pass;
        boolean askpass = true;

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Şifre Giriniz :");
            pass = input.nextInt();
            if(pass == 123) {
                System.out.println("Şifreniz Doğru");
                askpass = false;
            }else{
                System.out.println("Şifreniz Yanlış");
            }
        }while(askpass);

    }
}
