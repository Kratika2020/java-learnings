public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Kratika",23,30000.00,Location.HYD);
        Employee emp2 = new Employee(2,"Dhairya",23,45000.00,Location.GRM);

        Employee.showJob();
        emp1.giveRaise();
        emp1.showSalary();
        emp2.showSalary();
    }
}
