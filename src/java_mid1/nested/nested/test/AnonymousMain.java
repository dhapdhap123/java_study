package java_mid1.nested.nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        new Hello(){
            @Override
            public void hello(){
                System.out.println("hello");
            }
        }.hello();
    }
}
