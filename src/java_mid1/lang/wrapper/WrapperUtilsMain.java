package java_mid1.lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min:- " + Integer.sum(10, 20));
        System.out.println("max: " + Integer.sum(10, 20));
    }
}
