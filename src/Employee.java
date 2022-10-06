class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,double salary,int workHours,int hireYear){
        this.name =name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){
        if(this.salary>=1000){
            int taxprice = (int) ((this.salary*3) / 100);
            System.out.println("Vergi : " +taxprice);

        }else {
            int taxprice=0;
            System.out.println("Vergi : " +taxprice);


        }
    }
    void bonus(){
        if(this.workHours >40){
            int extra = ((workHours - 40) * 30);
            System.out.println("Bonus :" +extra);

        }else {
            int extra = 0 ;
            System.out.println("Bonus : " +extra);
        }
    }
    void raiseSalary (){
        int nowYear =2021;
        if(nowYear - this.hireYear <10){
            double increasedPrice = (this.salary*5) /100;
            System.out.println("Maas Artisi : +" +increasedPrice);
            System.out.println("Maas Artisi % 5'tir.");
        }else if (nowYear - this.hireYear >=10 && nowYear - this.hireYear <20 ){
            double increasedPrice = (this.salary*10) /100;
            System.out.println("Maas Artisi : +" +increasedPrice);
            System.out.println("Maas Artisi % 10'dur.");
        }else {
            double increasedPrice = (this.salary*15) /100;
            System.out.println("Maas Artisi : +" +increasedPrice);
            System.out.println("Maas Artisi % 15'tir.");
        }
    }
    void totalSalary (){
        
        System.out.println();

    }
    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Maas : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);



    }
}
