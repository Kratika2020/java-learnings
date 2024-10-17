import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter the marks : ");
        double marks = sc.nextFloat();

        Input ip = new Input(name,age,marks);
        String n = ip.getName();
        System.out.println("Name : "+n);
        int a = ip.getAge();
        System.out.println("Age : "+a);
        double m = ip.getMarks();
        System.out.println("Marks : "+m);
    }
}
