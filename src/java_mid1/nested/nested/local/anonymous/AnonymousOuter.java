package java_mid1.nested.nested.local.anonymous;

import java_mid1.nested.nested.local.LocalOuterV3;
import java_mid1.nested.nested.local.Printer;

import java.lang.reflect.Field;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int locarVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨.

        Printer printer = new Printer(){
            int value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("locarVar = " + locarVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        // printer.print()를 나중에 실행. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field: fields){
            System.out.println("field = " + field);
        }

    }
}
