public class MethodlardaOverloading {
    //Methodlarda aşırı yüklenme print olarak aynı ismin methodlara verilmesidir.
    static void print(){
        System.out.println("Parametresiz Method ");
    }
    static void print(int a ){
        System.out.println("Parametreler : " + a);
    }
    static void print(double a){
        System.out.println("Parametre double : "+ a);
    }
    static int print(int a, int b){
        return a+b;
    }
    static int print(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        print();
        print(13);
        print(3.2);
        System.out.println(print(2,5));
        System.out.println(print(3,4,5));
    }
}
