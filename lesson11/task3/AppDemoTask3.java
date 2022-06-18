package lesson11.task3;

public class AppDemoTask3 {
    public static void main(String[] args) {
        TextHandler handler = new TextHandler();
        String text = handler.process("cens1.txt", "black.txt");
        System.out.println(text);
    }
}
