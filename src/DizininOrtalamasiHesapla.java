public class DizininOrtalamasiHesapla {
    public static void main(String[] args) {
        int sum = 0;
        int [] list = {22, 33, 2, 33, 22};
        for(int i =0; i< list.length;i++){
            sum += list[i];
        }
        System.out.println("Average is " + (sum/ list.length));
    }
}
