public class ForEach {
    public static void main(String[] args) {
        int[] matris = {1, 2, 3, 4};

        for (int i = 0; i < matris.length; i++) {
            //System.out.println(matris[i]);
        }

        int sum = 0;

        for (int i : matris) {
            sum += i;
            System.out.println(sum);
        }

        String[] cars = {"BMW", "Mercedes", "Audi"};
        for (String i : cars) {
            System.out.println(i);
        }

        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for(int[]row: matris2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
