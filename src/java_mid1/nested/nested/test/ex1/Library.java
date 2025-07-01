package java_mid1.nested.nested.test.ex1;

public class Library {
    private Book[] books;
    private int maxIndex;
    private int nowIndex;

    public Library(int maxIndex){
        this.maxIndex = maxIndex;
        books = new Book[maxIndex];
    }

    public void addBook(String title, String author){
        if (nowIndex >= maxIndex){
            System.out.println("최대 책 수량 초과");
            return;
        }
        Book book = new Book(title, author);
        books[nowIndex++] = book;
        System.out.println("생성되었습니다.");
    }

    public void getBooks() {
        System.out.println("현재 책 목록 : ");
        for (Book book: books){
            System.out.println("제목: " + book.title + " | 작가: " + book.author);
        }
    }

    private class Book {
        private String title;
        private String author;

        private Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }
}
