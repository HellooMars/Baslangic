import java.util.Scanner;
public class RecursiveDeseneGoreMethod{
    static void desen( int n){
        for(int i=n; i>=-n ; i-=5){
            System.out.print(i + " ");
            if(i<=0){
                for(int k=i; k<=n ; k+=5){
                    System.out.print(k + " ");
                    if(k==n){
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir N sayısı giriniz: ");
        int n = input.nextInt();
        desen(n);

    }
}

