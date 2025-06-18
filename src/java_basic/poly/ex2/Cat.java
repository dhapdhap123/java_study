package java_basic.poly.ex2;

public class Cat extends Animal{
    String value = "Cat";
    @Override
    public void sound(){
        System.out.println("냐옹");
    }

    void method(){
        System.out.println("Cat.method");
    }
}
