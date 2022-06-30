public class TekBoyutluDiziler {
    public static void main(String[] args) {
        double[] list = new double[5];
        list[0] = 10;
        list[1] = 5;
        list[2] = 33;
        System.out.println(list[3]);
        String [] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};
        String [] weekdays = new String[]{"Cumartesi", "Pazar"};
        System.out.println(weekdays[0] + " " + weekdays[1]);
        for(int i =0; i < days.length; i++){
            System.out.println(days[i]);
        }



    }
}
