import java.util.Scanner;
public class HesapMakinasiSwitchCase {
    public static void main(String[] args) {
        int n1, n2, select, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz :");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();
        System.out.println("Seçiminiz :" + select );

        switch (select) {

            case 1:
                System.out.println("İşlemin Sonucu : " + (n1 + n2));
                    break;
            case 2:
                System.out.println("İşlemin sonucu :" + (n1 - n2));
                break;
            case 3:
                System.out.println("İşlemin sonucu :" + (n1 * n2));
                break;
            case 4:
                if(n2 != 0) {
                System.out.println("İşlemin sonucu :" + (n1 / n2));}
                else {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.");
        }


    }
}
