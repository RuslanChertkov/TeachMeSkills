package Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant();
        Student [] arr = new Student[4];
        arr[0]=new Student("Alex", "Bolshevski", "103", 7.3);
        arr[1]=new Student("Dima", "Pila", "23", 5.4);
        arr[2]=new Student("Anna", "Parmezan", "566", 6.3);
        arr[3]=new Student("Alina", "Okolskaya", "43", 8.9);
    }
}
