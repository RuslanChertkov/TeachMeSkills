package Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(){}

    public Phone(String number, String model, int weight){
this.number=number;
this.model=model;
this.weight=weight;
    }
    public void display(){
        System.out.printf("\nNumber:%s, Model:%s, Weight:%d", this.number, this.model, this.weight);
    }
    public void receiveCall(String name){
        System.out.printf("\nЗвонит %s", name);
    }
    public void getNumber(){
        System.out.printf("\nНомер:%s", this.number);
    }
    public void Phone(String number, String model){
        System.out.printf("\n!Инициализация!\nНомер:%s, Модель:%s",number, model);
    }
    public void Phone(){}

    public void receiveCall(String name, String number){
        System.out.printf("\nИмя:%s, Номер:%s");
    }
    public void sendMessageArray (String number, String[] arg){
        System.out.printf("Номера:", this.number);

    }

   /*public void Phone(String number, String model, int weight){
       this(number, model);
        this.weight=weight;

    }*/



}
