package java_mid1.nested.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 인스턴스의 참조값을 통해 생성
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
        
    }
}
