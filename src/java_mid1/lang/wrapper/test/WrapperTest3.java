package java_mid1.lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int intValue = integer.intValue();
        System.out.println("intValue = " + intValue) ;
        Integer integer2 = Integer.valueOf(intValue);

    }
}
