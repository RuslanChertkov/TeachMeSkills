package Reader;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[1] = new Reader("Петров В.В", 25, "ФКП", "24.06.1999", "+375447568925");
        readers[2] = new Reader();
        Book book = new Book("Приключения, Словарь, Энциклопедия", "Петров В.В");
        readers[1].takeBook(3);
        System.out.println();
        readers[1].takeBook("Приключения, Словарь, Энциклопедия");
        System.out.println();
        book.takeBook();
        System.out.println();
        readers[1].returnBook(3);
        System.out.println();
        readers[1].returnBook("Приключения, Словарь, Энциклопедия");
        System.out.println();
        book.returnBook();
    }
}
