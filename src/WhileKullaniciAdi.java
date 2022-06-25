import java.util.Scanner;
public class WhileKullaniciAdi {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess =false;
        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.print("Şifrenizi giriniz :");
            password = input.nextInt();
            if(password == 123) {
                System.out.println("Şifreniz Doğru.");
                isPasswordSuccess=true;
            }else{
                System.out.println("Şifreniz yanlış.");
            }
        }
    }
}
