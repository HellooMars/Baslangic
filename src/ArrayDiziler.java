public class ArrayDiziler {

    static int [] reverse(int [] list){
        int [] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--){
            reverse [i] = list[j];
        }return reverse;
    }

    static void printArray(int [] list){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }


    public static void main(String[] args) {
        /*
        Genel tanımı aşağıki gibidir.
        int [] list =new int [10];
        for(int i =0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);

        }
        */
        int [] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double [] list2 ={1,1,3,5,6};
        printArray(list);


        int [] newListe = reverse(list);
        printArray(newListe);


    }
}
