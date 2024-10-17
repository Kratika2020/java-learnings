public class Input {
    private String name;
    private int age;
    private double marks;

    Input(String name, int age, double marks ){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getMarks(){
        return this.marks;
    }
        
}
