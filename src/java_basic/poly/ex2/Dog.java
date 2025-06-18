package java_basic.poly.ex2;

public class Dog extends Animal{
    String value = "Dog";
    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    void method(){
        System.out.println("Dog.method");
    }
}
