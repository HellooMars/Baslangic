import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int age, distance;
        String type;
        double price , discountPrice, perKM =0.10;
        Scanner input = new Scanner(System.in);

        System.out.println("Yolculuğunuz tek yön mü yoksa gidiş dönüş mü :");
        type = input.nextLine();
        System.out.print("Gideceğiniz mesafe kaç KM uzaklıkta :");
        distance = input.nextInt();
        System.out.print("Kaç yaşındasınız :");
        age = input.nextInt();
        price = distance * perKM;
        System.out.println("Yolculuğunuzun indirimsiz ücreti :" + price);


        if(type.equals("gidiş dönüş")){
           if(age <12 ) {
               discountPrice = (price * 0.80) * 0.50;
               System.out.println("İndirimli Ücreti : " + discountPrice);
           }else if (age >=12 && age <24){
               discountPrice = (price * 0.80) * 0.10;
               System.out.println("İndirimli Ücreti : " + discountPrice);
           }else if (age >65){
               discountPrice = (price * 0.80) *0.30;
               System.out.println("İndirimli Ücreti : " + discountPrice);
           }else {
               discountPrice = price * 0.80;
               System.out.println("İndirimli Ücreti : " + discountPrice);
           }
        }else{if(age <12 ) {
            discountPrice = price * 0.50;
            System.out.println("İndirimli Ücreti : " + discountPrice);
        }else if (age >=12 && age <24){
            discountPrice = price * 0.10;
            System.out.println("İndirimli Ücreti : " + discountPrice);
        }else if (age >65){
            discountPrice = price * 0.30;
            System.out.println("İndirimli Ücreti : " + discountPrice);
        }else {
            discountPrice = price;
            System.out.println("İndirimli Ücreti : " + discountPrice);
        }
        }

    }
}
