package java_mid1.lang.immutable.address;

public class RefMain_1 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
