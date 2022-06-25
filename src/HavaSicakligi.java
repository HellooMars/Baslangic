import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int temp;
        Scanner enter = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz :");
        temp = enter.nextInt();

        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }else if (temp <= 25){
            if(temp <=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        }if (temp >= 10 ) {
            System.out.println("Piknik yapabilirsiniz.");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
