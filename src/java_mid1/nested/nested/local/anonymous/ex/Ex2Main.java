package java_mid1.nested.nested.local.anonymous.ex;

import java.util.Random;

public class Ex2Main {

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new randomDice());
        hello(new helloSum());
    }

    private record randomDice() implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 결과 = " + randomValue);
        }
    }
    private record helloSum() implements Process {
        @Override
        public void run() {
            for (int i=0; i<3; i++){
                System.out.println("i = " + i);
            }
        }
    }
}
