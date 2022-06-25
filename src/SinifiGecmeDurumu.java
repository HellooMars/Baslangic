import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int mat,fizik,kimya,tarih,muzik,counter =0,toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat= inp.nextInt();
        if (mat >0 && mat <= 100){
            toplam+=mat;
            counter++;
        } else {
            System.out.println("Belirtilen aralıkta rakam girmediniz !");
            counter =counter;
        }
        System.out.print("Fizik notunuzu giriniz :");
        fizik = inp.nextInt();
        if (fizik >0 && fizik <= 100){
            toplam+=fizik;
            counter++;
        } else {
            System.out.println("Belirtilen aralıkta rakam girmediniz !");
            counter =counter;
        }
        System.out.print("Kimya notunuzu giriniz :");
        kimya = inp.nextInt();
        if (kimya >0 && kimya <= 100){
            toplam+=kimya;
            counter++;
        } else {
            System.out.println("Belirtilen aralıkta rakam girmediniz !");
            counter =counter;
        }
        System.out.print("Tarih notunuzu giriniz :");
        tarih = inp.nextInt();
        if (tarih >0 && tarih <= 100){
            toplam+=tarih;
            counter++;
        } else {
            System.out.println("Belirtilen aralıkta rakam girmediniz !");
            counter =counter;
        }
        System.out.print("Müzik notunuzu giriniz :");
        muzik =inp.nextInt();
        if (muzik >0 && muzik <= 100){
            toplam+=muzik;
            counter++;
        } else {
            System.out.println("Belirtilen aralıkta rakam girmediniz !");
            counter =counter;
        }

        double average = toplam / counter;

        if (average >= 55) {
            System.out.println("Sınıfı geçtiniz !");
        }else {
            System.out.println("Sınıfta kaldınız !");
        }
        System.out.println("Ortalamanız :" + average);


    }
}
