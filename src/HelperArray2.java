import java.lang.reflect.Array;
import java.util.Arrays;

public class HelperArray2 {
    public static void main(String[] args) {
        int [] list = {1, 2, 3, 4};
        int [] list2 ={5, 33, 87, 1, 66};

        HelperArray helper = new HelperArray();
        helper.print(list);
        System.out.println();
        helper.print(list2);

        //Yeni bir nesne oluşturmadan aşağıdaki gibi direk bastırabiliriz
        System.out.println(Arrays.toString(list2));
        //Listedeki tüm değerleri 10 olarak bastırır aşağıdaki gibi.
        Arrays.asList(list2,10);
        System.out.println(Arrays.toString(list2));
        //Bir yukarıdaki işlemin aynısı aşağıda yapıyoruz method ile
        Arrays.fill(list2,10);
        System.out.println(Arrays.toString(list2));

        //İndeks içindeki değerleri değiştirmek için aşağıdakini kullan
        int [] list3 ={1, 2, 3, 4, 5, 6, 7};
        Arrays.fill(list3,2,5,10);
        System.out.println(Arrays.toString(list3));

        //İndek içindeki değerleri sıralaması için aşağıdakini kullan
        int [] list4 ={89, 33, 38, 46, 27, 77, -23};
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));

        // indis ve rakamı bulmak
        System.out.println(HelperArray.search(list4,77));

        //binary search ile arama yaptığımızda array sıralı şekilde olmalıdır
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));
        System.out.println(Arrays.binarySearch(list4,33));

        //Array kopyalama ve boyutunu belirleme aşağıdaki gibidir.
        int [] list5 ={89, 33, 38, 46, 27, 77, -23, 1, -55};
        int [] copyList = Arrays.copyOf(list5,4);
        System.out.println(Arrays.toString(copyList));
        System.out.println(HelperArray.copyList(list5,copyList));

        int [] copyList2 = Arrays.copyOfRange(list5,2,5);
        System.out.println(Arrays.toString(copyList2));

        int [] list6 = {1, 2, 3, 4};
        int [] list7 = {1, 2, 3, 4};
        int [] list8 = {1, 2, 3, 4, 6};
        System.out.println(Arrays.equals(list6,list7));
        System.out.println(HelperArray.equals(list6,list7));
        System.out.println(HelperArray.equals(list7,list8));

    }
}
