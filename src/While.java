public class While {
    public static void main(String[] args) {
      int x =1;
      int y ;

      while (x <= 5){
          System.out.println(x);
          y=1;
          while (y <=10){
              System.out.print(y);
              y++;

          }
          System.out.println();
          x++;
      }
    }
}
