package java_start.method;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod(double b, int a){
        System.out.println("double a, int b");
    }
}
