import java.util.Scanner;

public class VeriAlma {
    public static void main(String[] args) {
        /* System.out.println("Bir Yazı Girin");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        */
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayisini girin:");
        a= input.nextInt();

        System.out.println("B sayisini girin");
        b=input.nextInt();

        System.out.println("A sayisi : " + a);
        System.out.println("B sayisi : " + b);
    }

}
