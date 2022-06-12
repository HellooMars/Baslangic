public class IfElse {
    public static void main(String[] args) {

        int a=10, b=1;

        boolean compare = a == b;
        //String str = compare ? "Eşittir" : "Eşit Değildir";
        //System.out.print(str);

        if(compare) {
            a =50;
            System.out.println("Eşittir");
        } else {

            System.out.println("Eşit Değildir");
        }

        System.out.println("Program bitti");


    }
}
