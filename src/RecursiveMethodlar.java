public class RecursiveMethodlar {
    //Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir.
    //f(4) = f(3) + 4;
    //f(3) = f(2) + 3;
    //f(2) = f(1) + 2;
    //f(1) = 1;
        static int f(int n){
        if(n==1){
            return 1;
        }
        return f(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(f(3));


    }
}
