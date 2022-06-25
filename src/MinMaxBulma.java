import java.util.Scanner;
public class MinMaxBulma {
    public static void main(String[] args) {
        int piece, num, max=0, min=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz :");
        piece = input.nextInt();
        int i = 1;

        while(i <= piece){
            System.out.print(i+". Sayıyı giriniz:");
            num = input.nextInt();
            i++;
            if(i==piece){
                num = max;
                num = min;
            }else{
                if(num > max){
                    max = num;
                }else if(num < min ){
                    min = num;
                }
            }
        }
        System.out.println("Max Değer:" + max);
        System.out.print("Min Değer:" + min);
        //Min değer sıfır çıkıyor düzeltilmesi lazım !!
    }
}
