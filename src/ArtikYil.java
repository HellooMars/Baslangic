import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int year, kalan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı giriniz :");
        year = inp.nextInt();
        if(year % 4 == 0 && year %100 !=0){
            System.out.println("Artık yıldır.");
        } else {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("Artık yıldır.");
            } else {
                System.out.println("Artık yıl değildir.");
            }
        }

    }
}
