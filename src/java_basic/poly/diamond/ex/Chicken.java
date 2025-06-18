package java_basic.poly.diamond.ex;

public class Chicken extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("치킨 날다");
    }
}
