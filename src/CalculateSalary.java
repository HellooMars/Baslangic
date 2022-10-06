public class CalculateSalary {
    public static void main(String[] args) {
        Employee Engin = new Employee("Engin",1200,45,2009);
        Engin.printInfo();
        Engin.tax();
        Engin.bonus();
        Engin.raiseSalary();

    }
}
