import java.util.Scanner;
public class UsluSayilarWhile {
    public static void main(String[] args) {
       int n,k;
       Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin :");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı girin :");
        k = input.nextInt();
        int total = 1;

        int i =1;
        while(i <=k){
            total *=n;
            i++;
        }
        System.out.println(total);

    }
}
