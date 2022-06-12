import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        double a,b,c;

        Scanner girdi = new Scanner(System.in);

        System.out.print("A kenarının uzunluğunu giriniz : ");
        a = girdi.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz : ");
        b = girdi.nextDouble();


        c = Math.sqrt((a * a) + (b * b));

        System.out.print("Hipotenüsün uzunluğu :" + c);
    }
}
