public class Car {
    //Nitelikler
    String type;
    String model;
    String colour;
    int speed;
    int speedLimit;

    Car(String model, int speed, String colour){
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.type = "Sedan";
        this.speedLimit=180;
        System.out.println("Parametreli kurucu method oluşturuldu");
    }
    Car(){
        System.out.println("Boş kurucu methodu oluştu");
    }

    void increaseSpeed(int increment){
            this.speed +=increment;
    }

    void decreaseSpeed(int decrease){
        if(this.speed>0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Hızınız :" + this.speed);
    }

    void printInfo(){
        System.out.println("Model :\t"  + this.model);
        System.out.println("Colour :\t" + this.colour);
        System.out.println("Type :\t" + this.type);
        System.out.println("Speed :\t" + this.speed);
    }

}
