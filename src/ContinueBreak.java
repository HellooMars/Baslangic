public class ContinueBreak {
    public static void main(String[] args) {
        int i=1;
        /*for(i = 1;i <= 10;i += 1){

            if(i % 2 == 0){
                System.out.println(i);
                continue;
            }
        }

         */
        while(i <= 10){
            i+=1;
            if(i % 3 == 0){
                System.out.println("i değeri 3'tür" );
                break;

            }
        }
    }
}
