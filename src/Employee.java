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
	//Vergili maaşı tam sayı olarak döndürüyor.
    double Tax(){
		double taxedSalary = this.salary ;
        if(this.salary>=1000){
            taxedSalary = (int) (this.salary*3) / 100;
        }
		System.out.println("Vergi : " +taxedSalary);
		return taxedSalary;
    }
	//Bonus miktarını döndürüyor
    int Bonus(){
		int extra = 0;
        if(this.workHours >40){
            extra =  ((workHours - 40) * 30);
        }
		System.out.println("Bonus :" +extra);
		return extra;
		
    }
    void RaiseSalary (){
        int nowYear =2021;
		//Adamın vergili maaşının üstüne + bonus eklediğindeki maaşını veriyorç
		double taxedAndBonusAddedSalary = this.salary-Tax() + Bonus();
        System.out.println(taxedAndBonusAddedSalary);
		
        if(nowYear - this.hireYear <10){
            taxedAndBonusAddedSalary =taxedAndBonusAddedSalary + (taxedAndBonusAddedSalary*5) /100;
            System.out.println("Maas Artisi % 5'tir.");
            System.out.println("Vergiler dahil maasi : " +taxedAndBonusAddedSalary);
        }else if (nowYear - this.hireYear >=10 && nowYear - this.hireYear <20 ){
            taxedAndBonusAddedSalary = taxedAndBonusAddedSalary + (taxedAndBonusAddedSalary*10) /100;
            System.out.println("Maas Artisi % 10'dur.");
            System.out.println("Vergiler dahil maasi: " +taxedAndBonusAddedSalary);
        }else {
            taxedAndBonusAddedSalary = taxedAndBonusAddedSalary + (taxedAndBonusAddedSalary*15) /100;
            System.out.println("Maas Artisi % 15'tir.");
            System.out.println("Vergiler dahil maasi : " +taxedAndBonusAddedSalary);
        }


    }
    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Maas : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);

    }
}
