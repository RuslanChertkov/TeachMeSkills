package Reader;

public class Book {
    private String nameBook;
    private String author;

    public Book() {
    }

    public Book(String nameBook, String author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public void takeBook() {
        System.out.printf("%s взял книги:%s", this.author, this.nameBook);
    }
    public void returnBook(){
        System.out.printf("%s вернул книги: %s", this.author, this.nameBook);
    }
}
