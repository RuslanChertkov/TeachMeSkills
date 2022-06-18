package Person;

public class Person {
    private String fullName;
    private int age;

    public Person(){

    }

    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move(String fullName){
        System.out.printf("Такой-то %s говорит", fullName);
    }
    public void talk(String fullName){
        System.out.printf("Такой-то %s говорит", this.fullName);
    }

}
