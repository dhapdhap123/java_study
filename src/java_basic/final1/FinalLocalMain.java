package java_basic.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류

        final int data2 = 10;
//        data2 = 30; // 컴파일 오류
    }

    static void method(final int parameter){
        // 중간에 못 바꿈
        //        parameter = 20; // 컴파일 오류
    }
}
