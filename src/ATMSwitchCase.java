import java.util.Scanner;
public class ATMSwitchCase {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance = 1500;
        do {
            System.out.print("Kullanıcı adınızı giriniz :");
            userName = input.nextLine();
            System.out.println("Kullanıcı şifrenizi giriniz :");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, X bankasına hoşgeldiniz.");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                int choose;
                int price;
                choose = input.nextInt();
                switch (choose){
                    case 1:
                        System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                        price = input.nextInt();
                        balance +=price;
                        System.out.println("Hesabınızdaki tutar "+ balance);
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz miktarı giriniz:");
                        price =input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiyeniz yetersiz.");
                        }else{
                            balance-=price;
                            System.out.println("Çekme işleminiz başarıyla gerçekleştirilmiştir.");
                            System.out.println("Kalan bakiyeniz "+ balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz :" + balance);
                        break;
                    case 4:
                        System.out.println("Çıkış yapılmıştır, iyi günler.");
                        break;

                }
            }else{
                right--;
                System.out.println("Kullanıcı adınız veya şifreniz yanlış tekrar deneyiniz.");
                System.out.println("Kalan hakkınız :"+ right);
                if(right==0){
                    System.out.println("Bankayla iletişime geçiniz.");
                }
            }
        }while(right != 0);
    }
}
