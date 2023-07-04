//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    String userFullName;
    int readerTicket;
    String faculty;
    BirthDate userBDay;
    int phoneNumber;

    public Reader() {
        this.userFullName = "Unknown reader";
        this.faculty = "Unknown faculty";
        this.userBDay = new BirthDate();
    }

    public Reader setUserFullName(String userFullName) {
        this.userFullName = userFullName;
        return this;
    }

    public Reader setReaderTicket(int readerTicket) {
        this.readerTicket = readerTicket;
        return this;
    }

    public Reader setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public Reader setUserBDay(BirthDate userBDay) {
        this.userBDay = userBDay;
        return this;
    }

    public Reader setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void takeBook(String... bookNames) {
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < bookNames.length - 1; i++) {
            bookList.append(bookNames[i]).append(", ");
        }
        bookList.append(bookNames[bookNames.length - 1]).append(". ");
        System.out.println(String.format("%s took books: %s\n", userFullName, bookList.toString()));
    }

    public void takeBook(int amount) {
        System.out.println(String.format("%s took %d books\n", userFullName, amount));

    }

    public void takeBook(Book... books) {
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < books.length - 1; i++) {
            bookList.append(books[i].name).append(", ");
        }
        bookList.append(((books[books.length - 1])).name).append(".");
        System.out.println(String.format("%s took books: %s\n", userFullName, bookList.toString()));
    }

    public void returnBook(int amount) {
        System.out.println(String.format("%s returned %d books\n", userFullName, amount));
    }

    public void returnBook(String... bookNames) {
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < bookNames.length - 1; i++) {
            bookList.append(bookNames[i]).append(", ");
        }
        bookList.append(bookNames[bookNames.length - 1]).append(".");
        System.out.println(String.format("%s returned books: %s\n", userFullName, bookList.toString()));

    }

    public void returnBook(Book... books) {
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < books.length - 1; i++) {
            bookList.append(books[i].name).append(", ");
        }
        bookList.append(((books[books.length - 1])).name).append(".");
        System.out.println(String.format("%s returned books: %s\n", userFullName, bookList.toString()));
    }
}
