public class ContinueBreak2 {
    public static void main(String[] args) {

        /*for(i = 1;i <= 10;i += 1){

            if(i % 2 == 0){
                System.out.println(i);
                continue;
            }
        }

         */
        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }

    }
}
