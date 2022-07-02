import java.util.Arrays;
import java.util.Scanner;
public class DizidekiSayilariSiralama {
    public static void main(String[] args) {
        int n, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        n = input.nextInt();
        int [] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");

        for(int i =0; i<n;i++){
            number = input.nextInt();
            list[i] = number;
        }
        for(int i =0;i< list.length; i++){
            System.out.println((i+1) +".Elemanı " + list[i]);
        }
        Arrays.sort(list);
        System.out.print("Sıralama : "+ Arrays.toString(list));
    }
}
