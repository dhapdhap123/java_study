package java_mid1.nested.nested.test;

public class OuterClass3 {

    public void myMethod(){
        class LocalClass{
            void hello(){
                System.out.println("hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
