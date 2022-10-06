import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        //int num = (int) (Math.random() *100);
        Random rand = new Random();
        int num = rand.nextInt(100);
        int right=0;
        int selected;
        int [] wrong = new int[5];
        System.out.println(num);

        Scanner input = new Scanner(System.in);


        while(right<5){
            System.out.println("Tahmininizi giriniz : ");
            selected = input.nextInt();
        if(selected<0 || selected>99 ){
            System.out.println("Belirtilen aralıkta sayı giriniz.");
            continue;
        }

        if(num==selected){
            System.out.println("Sayıyı doğru tahmin ettiniz !!" + num);
            break;
        }else{
            wrong[right] = selected;
            right++;
            System.out.println("Hatalı bir sayı girdiniz.");
            if(selected>num){
                System.out.println(selected +"Gizli sayıdan büyüktür");
            }else{
                System.out.println(selected +"Gizli sayıdan küçüktür");
            }
            System.out.println("Kalan hakkınız :" + (5-right));

        }


        }
    }
}
