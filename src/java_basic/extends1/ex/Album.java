package java_basic.extends1.ex;

public class Album extends Item{

    private String artist;

    public Album(String name, int price, String artist){
        super(name, price);
        this.artist = artist;
        System.out.println("Album 생성자");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 가수: " + artist);
    }
}
