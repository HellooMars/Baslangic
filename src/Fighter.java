public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        if(this.dodge >=0 && this.dodge<=100){
            this.dodge = dodge;
        }else{
            this.dodge =0;
        }
    }

    int hit(Fighter foe){

        if(foe.isFirst()){
            System.out.println(this.name +" ilk hasarı " + foe.name + " verdi.");
        }else{
            System.out.println(foe.name +" ilk hasarı " + this.name + " verdi.");
        }
        System.out.println(this.name + " => " +foe.name + " " +this.damage + " hasar vurdu" );

        if(foe.isDodge()){
            System.out.println(foe.name + "Gelen hasarı blockladı.");
            System.out.println("---------------");
            return foe.health;
        }

        if(foe.health - this.damage <0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() *100;
        return randomNumber <= this.dodge;
    }

    boolean isFirst(){
        double randomNumber2 = Math.random() * 100;
        double randomNumber3 = Math.random() *100;
        return randomNumber2 < randomNumber3;
    }

}
