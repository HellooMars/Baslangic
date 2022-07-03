public class RepeatNumberArray {
    static boolean isFind (int [] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] list ={10, 20, 20, 10, 10, 20, 5, 20};


        for(int i =0;i< list.length;i++){
            int count=0;
            for(int j=0; j< list.length;j++){
                if(!isFind(list,list[i])) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
            }System.out.println(list[i] +"Sayısından" +count +"kere tekrar edildi");
        }
    }
}
