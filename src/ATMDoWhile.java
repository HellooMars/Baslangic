import java.util.Scanner;

public class ATMDoWhile {
    public static void main(String[] args) {

        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while(right > 0) {

            System.out.println("Kullanıcı Adınız :");
            username = input.nextLine();
            System.out.println("Şifrenizi Giriniz :");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba X bankasına hoşgeldiniz.");
               do{
                   System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                   System.out.println("Yapmak istediğniz işlemi seçiniz :");
                   select =input.nextInt();
                   if(select ==1) {
                       System.out.println("Yatıracağınız para miktarını giriniz :");
                       int price;
                       price = input.nextInt();
                       balance += price;
                   }else if(select == 2) {
                       System.out.println("Çekmek istediğiniz miktarı giriniz :");
                       int price;
                       price = input.nextInt();
                       if (price > balance) {
                           System.out.println("Bakiye yetersiz.");
                       } else {
                           balance -= price;
                           System.out.println("Para çekme işleminiz başarılı." + balance);
                       }
                   }else if (select == 3){
                       System.out.println("Kalan bakiyeniz :" + balance);
                   }
               }
               while(select !=4);
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur, banka ile iletişime geçin.");
                }
                System.out.println("Kalan hakkınız :" + right);
            }
        }

    }
}
