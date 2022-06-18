package Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alex", 19);

        person1.move("Nikita");
        System.out.println();
        person2.talk(person2.getFullName());
    }


}
