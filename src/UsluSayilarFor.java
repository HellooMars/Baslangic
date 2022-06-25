import java.util.Scanner;

public class UsluSayilarFor {
    public static void main(String[] args) {
       int n,k;
       Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin :");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı girin :");
        k = input.nextInt();
        int total = 1;
        int count=k;

        for(k=1; k<=count; k++){
            total *=n;

        }
        System.out.println(total);

    }
}
