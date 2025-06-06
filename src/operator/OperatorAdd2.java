package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1, b = 0;

        // 전위 증감 연산자
        b = ++a; // a값 먼저 증가, 그 결과 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 후위 증감 연산자
        b = a++; // b에 현재 a 대입 후 a값 증가
    }
}
