import java.util.Scanner;
public class RecursiveAsalSayi {
    static boolean isPrime(int num, int i){
        if(num <=2){
            return (num==2)?true:false;
        }
        if(num % i==0){
            return false;
        }
        if(i*i >num){
            return true;
        }

            return isPrime(num,i+1);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int num = input.nextInt();
        if(isPrime(num,2)) {
            System.out.println(num + " asal sayıdır.");
        } else{
            System.out.println(num + "asal sayı değildir.");
        }
    }
}
