package java_basic.static2;

// 지정
import static java_basic.static2.DecoData.staticCall;
// 전부
// import static java_basic.static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

//        DecoData.staticCall(decoData1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
