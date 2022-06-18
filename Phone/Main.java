package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375445467456", "Samsung", 150);
        Phone phone2 = new Phone("80292367565", "Apple", 160);
        Phone phone3 = new Phone("+375294587343", "Xiaomi", 200);

        phone1.display();
        phone2.display();
        phone3.display();

        phone1.receiveCall("Pasha");
        phone2.receiveCall("Alexander");
        phone3.receiveCall("Ruslan");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.Phone("+375296485720", "Alcatel");

        phone1.receiveCall("Misha", "+3756748652");

    }


}
