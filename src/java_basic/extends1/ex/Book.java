package java_basic.extends1.ex;

public class Book extends Item {

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
        System.out.println("Book 생성자");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 작가: " + author + "isbn: " + isbn);
    }
}
