package java_basic.oop.construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("title: " + title + " author: " + author + " page: " + page);
    }
}
