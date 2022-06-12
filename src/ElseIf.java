public class ElseIf {
    public static void main(String[] args) {

        int a =10, b=20, c=1;
        if ((a < b && a < c)) {
            System.out.println("A en küçük sayıdır.");
        } else if (b < a && b < c) {
            System.out.println("B en küçük sayıdır");
        }
        else  {
            System.out.println("C en küçük sayıdır" );
        }
    }
}
