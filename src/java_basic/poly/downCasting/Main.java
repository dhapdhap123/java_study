package java_basic.poly.downCasting;

public class Main {

    public static void main(String[] args) {
        // 업캐스팅 (자동)
        A a = new A();
        A b = new B();
        A c = new C();

        // 필드는 오버라이딩 X
//        System.out.println(a.value); // A
//        System.out.println(b.value); // A
//        System.out.println(c.value); // A
        // 오버라이딩 우선순위
//        a.method(); // A.method
//        b.method(); // B.method
//        c.method(); // C.method

        // 다운 캐스팅
        A a1 = new B(); // a로 업캐스팅

//        C c1 = (C) new B();
        A b1 = new B();
        System.out.println(b1.value);
        b1.method();

        A a2 = new B();
        B a3 = (B) a2;
        a3.method();
    }
}
