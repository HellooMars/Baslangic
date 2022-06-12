import java.util.Scanner;
public class NotOrtalamasi


{public static void main(String[] args) {

 // Değişkenleri oluştur

 int mat, fizik, kimya, turkce, tarih, muzik;

 //Scanner sınıfını tanımladık
 Scanner inp = new Scanner(System.in);

// Kullanıcıdan değerleri al

    System.out.println("Matematik Notunuz :");
    mat = inp.nextInt();

    System.out.println("Fizik Notunuz :");
    fizik = inp.nextInt();

    System.out.println("Kimya Notunuz :");
    kimya = inp.nextInt();

    System.out.println("Turkce Notunuz :");
    turkce = inp.nextInt();

    System.out.println("Tarih Notunuz :");
    tarih = inp.nextInt();

    System.out.println("Muzik notunuz :");
    muzik = inp.nextInt();

    int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

    double sonuc = (toplam / 6);
    System.out.println("Ortalamaniz :" +sonuc);


    boolean kosul = sonuc >=60;
    String gectiMi = kosul ? "Sinifi Geçti" : "Sinifta Kaldi";
    System.out.println(gectiMi);



}
}
