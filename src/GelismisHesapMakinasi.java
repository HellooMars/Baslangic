import java.util.Scanner;
public class GelismisHesapMakinasi {
    static int sum(int a,int b) {
        int result= a + b;
        System.out.println("Toplama işleminin sonucu" + result);
        return result;
    }
        static int minus(int a,int b){
        int result= a -b;
            System.out.println("Çıkarma işleminin sonucu" + result);
        return result;
    }
    static int multiple(int a, int b){
        int result = a * b;
        System.out.println("Çarpma işleminin sonucu" + result);
        return result;
    }
    static int divide(int a, int b){
        if(b==0){
            return 0;
        }
        int result= a / b;
        System.out.println("Bölme işleminin sonucu" + result);
        return result;
    }
    static int power(int a,int b){
        int result =1;
        for(int i=1; i <=b; i++){
            result *=a;
        }
        System.out.println("Üs alma işleminin sonucu" + result);
        return result;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static void calculate(int a, int b){
        System.out.println("Çevresi :" + 2*(a + b));
        System.out.println("Alanı :" + a*b);
    }
    public static void main(String[] args) {
        int num1,num2,select;
        Scanner input = new Scanner(System.in);
        String menu = "1-Toplama İşlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3-Çarpma İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Mod Alma\n"
                +"7-Dikdörtgen Alan ve Çevre Hesabı\n"
                +"8-Çıkış Yap";

        System.out.println(menu);

        while(true){
            System.out.println("Yapmak istediğiniz İşlemi Seçiniz");
            select = input.nextInt();
            if(select ==0){
                break;
            }
            System.out.print("Birinici sayıyı giriniz:");
            num1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz :");
            num2 = input.nextInt();

            switch (select) {
                case 1:sum(num1,num2);
                break;
                case 2:minus(num1,num2);
                break;
                case 3:multiple(num1,num2);
                break;
                case 4:divide(num1,num2);
                if(num2==0){
                    System.out.println("İkinci sayı sıfırdan farklı olmalıdır.");
                }
                break;
                case 5:
                    System.out.println("Üs hesabı" + power(num1,num2));
                break;
                case 6:
                    System.out.println("Mod alma işlemi" + mod(num1,num2));
                    break;
                case 7:
                    calculate(num1,num2);
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz.");
            }
        }
        System.out.println("Bay Bayyyy");
    }
}
