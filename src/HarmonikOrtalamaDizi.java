public class HarmonikOrtalamaDizi {
    public static void main(String[] args) {
        int [] list = new int[13];

        double harmonikAverage =0;

        for(double i =1; i <list.length+1 ; i++){
          harmonikAverage += 1/ i;
        }
        System.out.println(harmonikAverage);


        int[] arr={1,2,3,4,5,6};

        double sum=0;

        for (double i:arr){
            sum+=1/i;
        }
        System.out.println(sum);

    }
}
