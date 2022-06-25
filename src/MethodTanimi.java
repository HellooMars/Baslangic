public class MethodTanimi {

    static void helloworld(){
        System.out.println("Merhaba Dünya!");
    }
    static int power(int base,int exp){
        int result =1;
        for(int i =1; i <=exp;i++){
            result *=base;
        }
        return result;
    }
    public static void main(String[] args) {
        int num1=2, num2=3;
        System.out.println(power(num1,num2));
       //System.out.println(power(2,3));
        System.out.println(power(2,3));
        /* 3 şekilde de yazılabilir.
        int case1=power(2,3);
        System.out.println(case1);
        */

        /*Aşağıdaki işlemleri daha kısa şekilde yapmamızı sağlıyor.
        int base =2, exp=3, result=1;

        for(int i=1;i<=exp;i++){
            result *=base;
        }
        System.out.println(result);

        base =4;
        exp =2;
        result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        System.out.println(result);

         */
        //sout içerisinde yazılmaz
        helloworld();

    }
}
