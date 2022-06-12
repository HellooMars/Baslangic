import java.util.Scanner;
public class DaireAlaniCevresi {
    public static void main(String[] args) {

        /*double pi =3.14, r, acı, cevresi, alani;
        Scanner yarıcap = new Scanner(System.in);

        System.out.print("Yarı çapı giriniz :");
        r = yarıcap.nextDouble();

        cevresi = 2 * pi * r;
        alani = pi* r *r;

        System.out.println("Dairenin çevresi : " + cevresi);
        System.out.println("Dairenin alanı : " + alani);


         */

        double r, angle, pi = 3.14, alan;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz : ");
        r = input.nextDouble();

        System.out.println("Dairenin açısını giriniz : ");

        angle = input.nextDouble();
        alan = (pi * (r * r) * angle)/360;

        System.out.println("Dairenin alanı : " + alan);




    }
}
