public class ReturnMethod {
    static int sum(int a, int b){
        //Geriye değer döndürür return ile.
        int result = a + b;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int result = sum(2,5) + sum(3,6);
        System.out.println(result);

    }
}
