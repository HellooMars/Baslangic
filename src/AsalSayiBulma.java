import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {
        int num,i;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        num = input.nextInt();

        for(i =2; i<=num;i++) {
            int count=0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
                    if (count == 2) {
                        System.out.println(i + " ");
                    }

        }
    }
}
