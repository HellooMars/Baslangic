import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,reset;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz :");
        userName = inp.nextLine();
        System.out.print("Kullanıcı şifrenizi giriniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && (password.equals("java101"))) {
            System.out.println("Giriş Başarılı !"); }
            else {
            System.out.println("Giriş Başarısız !\nŞifrenizi sıfırlamak istiyor musunuz?");
            reset = inp.nextLine();
            if (reset.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz :");
                password =inp.nextLine();
            } if(password.equals("java101")) {
                System.out.println("Bir önceki şifreni ile aynı şifreyi kullanamazsınız. Lütfen Başka şifre giriniz :");
                password =inp.nextLine();}
                else if(!password.equals("java101")) {
                    System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir.");
                } else {
                System.out.println("Şifreni başarılı bir şekilde değiştirilmiştir.");
            }
            }
        }
    }

