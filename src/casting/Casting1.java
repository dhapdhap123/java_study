package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 200000000000000L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
