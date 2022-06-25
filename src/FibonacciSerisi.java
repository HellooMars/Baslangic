import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int eleman,oncekiNum=0,simdikiNum=1,sonrakiNum=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisini kaç elemanlı girmek istiyorsunuz :");
        eleman = input.nextInt();


        for(int i =0;i <= eleman;++i) {
            System.out.println(oncekiNum + " ");
            sonrakiNum = simdikiNum + oncekiNum;
            oncekiNum = simdikiNum;
            simdikiNum = sonrakiNum;
        }
    }
}
