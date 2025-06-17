package java_basic.extends1.ex;

public class Item {

    protected String name;
    protected int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("Item 생성자 실행");
    }

    public void print(){
        System.out.println("이름: " + name + " 가격: " + price);
    }

    public int getPrice(){
        return price;
    }
}
