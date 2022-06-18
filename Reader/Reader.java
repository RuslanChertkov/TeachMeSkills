package Reader;

import java.util.Scanner;

public class Reader {
    private String fio;
    private int numberOfTicket;
    private String faculty;
    private String birthday;
    private String phoneNumber;

    public Reader() {

    }

    public Reader(String fio, int numberOfTicket, String faculty, String birthday, String phoneNumber) {
        this.fio = fio;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countBook) {
        System.out.printf("%s взял %d книги", this.fio, countBook);
    }

    public void takeBook(String booksName) {
        System.out.printf("%s взял книги:%s", this.fio, booksName);
    }

    public void returnBook(int countBook) {
        System.out.printf("%s вернул %d книги", this.fio, countBook);
    }

    public void returnBook(String booksName) {
        System.out.printf("%s вернул книги: %s", this.fio, booksName);
    }

    public void rekursia(int A, int B) {
        if (A<B){

        }

    }
}
