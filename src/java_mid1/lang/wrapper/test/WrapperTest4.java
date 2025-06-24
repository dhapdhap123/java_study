package java_mid1.lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int intValue = integer; // 오토 박싱
        System.out.println("intValue = " + intValue) ;
        Integer integer2 = intValue; // 오토 언박싱

    }
}
