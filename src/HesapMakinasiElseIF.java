import java.util.Scanner;
public class HesapMakinasiElseIF {
    public static void main(String[] args) {

        int n1, n2, select, result;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz");
        n2 = inp.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi yapınız ");
        select = inp.nextInt();
        System.out.println("Seçiminiz :" + select);

        if( select == 1) {
            result = n1 + n2;
            System.out.println("İşlemin sonucu : " + result);
        }else if (select == 2){
            result = n1 - n2;
            System.out.println("İşlemin sonucu :" + result);
            }else if(select == 3){
            result = n1 * n2;
            System.out.println("İşlemin sonucu :" + result);
        }else if (select == 4){
            if(n2 != 0) {
                result = n1 / n2;
                System.out.println("İşlemin sonucu: "+ result);
            }else{

            System.out.println("Bir sayı 0'a bölünemez.");
        } }else {
            System.out.println("Yanlış seçim yaptınız.");
        }






    }
}
