import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double boy, kilo, vucutendeksi;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz ");
        kilo = input.nextDouble();

        vucutendeksi = kilo / (boy * boy);

        System.out.print("Vücut kitle endeksiniz " + vucutendeksi);




    }
}
