package java_basic.poly.ex2;

public class Duck extends Animal{
    String value = "Duck";
    @Override
    public void sound(){
        System.out.println("꽉꽉");
    }
    
    void method(){
        System.out.println("Duck.method");
    }
}
