import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        try {
            System.out.print("Enter your name : ");
            String name = reader.readLine();

            System.out.print("Enter your age : ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your marks :");
            float marks = Float.parseFloat(reader.readLine());

            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Marks : "+marks);

        }

        catch(Exception e){
            
        }
        
    }
}
