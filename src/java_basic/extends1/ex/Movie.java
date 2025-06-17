package java_basic.extends1.ex;

public class Movie extends Item {

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor){
        super(name, price);
        this.director = director;
        this.actor = actor;
        System.out.println("Book 생성자");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 감독: " + director + "배우: " + actor);
    }
}
