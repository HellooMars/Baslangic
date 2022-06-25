import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        int n,m,total1=1,total2=1,total3=1,total4;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz :");
        n= input.nextInt();
        System.out.println("2.Sayıyı giriniz :");
        m= input.nextInt();
        for(int i=1; i<=n;i+=1){
            total1 *=i;
        }
        for(int i=1; i<=m;i+=1){
            total2 *=i;
        }
        for(int i=1; i<=n-m;i+=1){
            total3 *=i;
        }
        total4=total1/(total2*total3);
        System.out.println(total4);
    }
}
