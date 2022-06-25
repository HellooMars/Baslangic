public class SwitchCase {
    public static void main(String[] args) {

        int day = 3;

      /*  if (day == 1) {
            System.out.println("Bugün pazartesi");
        } else if (day == 2) {
            System.out.println("Bugün salı");
        } else if (day == 3) {
            System.out.println("Bugün çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün perşembe");
        } else if (day == 5) {
            System.out.println("Bugün cuma");
        } else if (day == 6) {
            System.out.println("Bugün cumartesi");
        } else if (day == 7) {
            System.out.println("Bugün pazar");
        }else{
            System.out.println("Hatalı giriş yaptınız");
        }
        */

        switch (day) {

            case 1:
                System.out.println("Bugün pazartesi");
                System.out.println("Program bitti");
                break;
            case 2:
                System.out.println("Bugün salı");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }




    }
}
