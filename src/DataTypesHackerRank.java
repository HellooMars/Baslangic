import java.util.Scanner;
public class DataTypesHackerRank {
    public static void main(String[] args) {
        long t;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number : ");

        t = inp.nextLong();
        boolean compare1 = (t >= -127 && t<= 127);
        boolean compare2 = ((t >= 128 && t <= 32767) || (t >= -32767 && t <= -128));
        boolean compare3 = ( t >=32768 && t <= 2147483647) || (t <=-32768 && t >= -2147483647 ) ;
        boolean compare4 = ( t > 2147483647 || t < -2147483647 );

        System.out.println( t + "can be fitted in :");

            if (compare4) {

                System.out.println("Long ");
            }
        else if (compare3) {

            System.out.println("integer");
        }
        else if(compare2) {

            System.out.println("short");
        }
        else if (compare1) {

            System.out.println(" byte");

        }
        else  {

                System.out.println( "can't be fitted anywhere.");

            }


    }
}
