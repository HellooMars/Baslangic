import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5, toplam;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız :");
        armutKilo= girdi.nextInt();

        System.out.print("Kaç Kilo Elma Aldınız :");
        elmaKilo=girdi.nextInt();

        System.out.print("Kaç Kilo Domates Aldınız :");
        domatesKilo=girdi.nextInt();

        System.out.print("Kaç Kilo Muz Aldınız : ");
        muzKilo=girdi.nextInt();

        System.out.print("Kaç Kilo Patlican Aldınız : ");
        patlicanKilo= girdi.nextInt();

        toplam = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) +(muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.print("Toplam Ödenecek Tutar :" + toplam + "TL");


    }
}
