package java_mid1.lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(findValue(intArr, new MyInteger(-1)));
    }

    private static MyInteger findValue(MyInteger[] intArr, MyInteger target){
        for (MyInteger value: intArr){
            if (value == target){
                return value;
            };
        }
        return null;
    }
}
