package java_mid1.lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        b= 20;
        System.out.println("b -> 20");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
