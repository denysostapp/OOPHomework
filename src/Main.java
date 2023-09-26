
class Student {
    // Public properties of various data types
    public String name;
    public int age;
    public double averageGrade;
    public boolean isFromKyiv;

    public Student(String name, int age, double averageGrade, boolean isFromKyiv) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
        this.isFromKyiv = isFromKyiv;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Is From Kyiv: " + isFromKyiv);
    }
}
class Demonstration{
}
class demonstrationWithMethod{
    public void methodDemostration(String str){
        System.out.println(str);
    }
}
//class demonstrationWithPrivateMethod{
//    private void privateMethodDemonstration(String str){
//    }
//}
class DemonstrateConstructorUsingNameSurname{
    public String name;
    public int age;
    public String surname;

    public DemonstrateConstructorUsingNameSurname(String name, String surname, int age){
        this.name = name;
        this.age = age;
        this.surname = surname;
        System.out.println(name + surname + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Demonstration create = new Demonstration();
        demonstrationWithMethod create2 = new demonstrationWithMethod();
        create2.methodDemostration("Print to demonstrate the method");
//        demonstrationWithPrivateMethod create3 = new demonstrationWithPrivateMethod();
//        create3.privateMethodDemonstration("Print it");
        DemonstrateConstructorUsingNameSurname create4 = new DemonstrateConstructorUsingNameSurname("Denys", "Ostapenko", 17);
        Student student1 = new Student("Denys", 17, 8, true);

        System.out.println("Info through the object:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Average grade: " + student1.averageGrade);
        System.out.println("Is From Kyiv: " + student1.isFromKyiv);

        // Access properties inside the class from a method
        System.out.println("\n");
        student1.displayStudentInfo();
    }
}