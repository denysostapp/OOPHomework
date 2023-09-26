public class StudentPrivate {
    private String name;
    private int age;
    private double AverageGrade;
    public StudentPrivate(String name, int age, double AverageGrade)  {
        this.name = name;
        this.age = age;
        this.AverageGrade = AverageGrade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(double AverageGrade) {
        this.AverageGrade = AverageGrade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average grade: " + AverageGrade);
    }
    public static void main(String[] args) {
        StudentPrivate student1 = new StudentPrivate("Alice", 20, 3.5);

        System.out.println("Accessing properties through getters and setters:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Average grade: " + student1.getAverageGrade());

        System.out.println("\n");
        student1.displayStudentInfo();
    }
}
