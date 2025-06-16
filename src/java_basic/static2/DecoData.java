package java_basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMtehod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod();

    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
