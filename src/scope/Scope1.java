package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true){
            int x = 20; // x 생존 시작
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        } // x 생존 종료

        // System.out.println("x = " + x); // 오류. 변수 x에 접근 불가
        System.out.println("m = " + m);
    }
}
