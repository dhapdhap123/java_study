package java_mid2.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue(); // 다운 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("1000");
        String string = (String) stringBox.getValue(); // 다운 캐스팅
        System.out.println("string = " + string);

        // 잘못된 타입의 인수 전달
        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result); // 에러
    }
}
