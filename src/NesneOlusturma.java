public class NesneOlusturma {
    public static void main(String[] args) {
        Car audi = new Car("audi",10,"blue");
        audi.printInfo();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(50);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();


    }
}
