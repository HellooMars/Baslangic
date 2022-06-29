public class Employee {
    Employee worker1;
    Employee worker2;
    String name;
    double salary;
    int workHours;
    int hireYear;
    int nowYear = 2021;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary *= 0.97;
        }else{
            return 0;
        }
    }

    double shift(){
        if(this.workHours >40){
            return this.salary +(this.workHours-40)*30;
        }else {
            return this.salary;
        }
    }

    double raiseSalary() {
        if (nowYear - this.hireYear < 10) {
            return this.salary * 1.05;
        }
        if (nowYear - this.hireYear >= 10 && nowYear - this.hireYear < 19) {
            return this.salary * 1.10;
        }
            return salary*1.15;
    }

    void printAll(){
        System.out.println("Adı : " +this.name);
        System.out.println("Maaşı : " +this.salary);
        System.out.println("Çalışma Saati :" +this.workHours);
        System.out.println("Başlangıç Yılı : " +this.hireYear);
        System.out.println("Vergi :" +tax());
        System.out.println("Bonus " +shift());
        System.out.println("Maaş Artışı :" +raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş ");
        System.out.println("Toplam maaş :");

    }
}