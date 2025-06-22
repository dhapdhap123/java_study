package java_mid1.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);

        Long longObj = Long.valueOf(1000000000L);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);

        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==:" + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
