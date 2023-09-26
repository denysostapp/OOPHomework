package Hobby;

public class Tennis {
    public String fullName;
    public int age;
    private String nationality;
    public boolean wasFirstRocket;

    public Tennis(String fullName, int age, String nationality, boolean wasWorldRocket){
        this.fullName = fullName;
        this.age = age;
        this.nationality = nationality;
        this.wasFirstRocket = wasWorldRocket;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void printInfo(){
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Was a world rocket? " + wasFirstRocket);
    }



}
