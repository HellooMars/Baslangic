import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {

        double fiyat, KDVli, KDV;

        System.out.print("Fiyat Bilgisi Giriniz :");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();

        KDV = fiyat * 0.18;
        KDVli = fiyat + KDV;


        System.out.println("Fiyati :" + fiyat);
        System.out.println("KDV Tutari :" + KDV);
        System.out.println("KDVli Fiyati " + KDVli);












    }
}
