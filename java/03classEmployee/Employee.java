public class Employee {
    int empid;
    String name;
    int age;
    double salary;
    Location loc;
    static String job = "IT SECTOR";

    Employee(int empid, String name, int age, double salary, Location loc){
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.loc = loc;
    }

    void giveRaise(){
        this.salary = (this.salary*0.3)+this.salary;
    }

    void showSalary(){
        System.out.println("Current Salary of "+this.name+" is : "+this.salary);
    }

    static void showJob(){
        System.out.println("Welcome to "+job);
    }
}

