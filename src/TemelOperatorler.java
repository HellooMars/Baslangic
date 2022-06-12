public class TemelOperatorler {
    public static void main(String[] args) {
        int a = 5, b=2, c=5;
        boolean kosul = a!=b;
        boolean kosul1 = a==c;
        boolean kosul2 = a<=b;
        boolean sonuc1 = kosul1 && kosul2;
        boolean sonuc2 = kosul1 || kosul2;
        boolean sonuc3 = !(kosul1 && kosul2);

        System.out.println(kosul);
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);

        String str = sonuc1 ? "Dogru" : "Yanlis";
        System.out.println(str);
        int result = sonuc1 ? 1 : 0;
        System.out.println(result);

    }
}
