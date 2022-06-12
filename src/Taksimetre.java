import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        //Gittiği yola X dedik

        double X, kilometreFiyatı;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaç kilometre yol gittiniz : ");
        X = girdi.nextDouble();

        kilometreFiyatı = 10 + (X * 2.20);

        boolean kosul = kilometreFiyatı >= 20;
        String yazdır = String.valueOf(kosul ? kilometreFiyatı : 20);
        System.out.print("Taksi Ücreti :" + yazdır);





    }
}
