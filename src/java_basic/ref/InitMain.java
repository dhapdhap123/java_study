package java_basic.ref;

public class InitMain {

    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println(data.value1);
        System.out.println(data.value2);
        System.out.println(data.string);

        if (true){
            String string;
//            System.out.println("string = " + string); 지역변수는 초기화하지 않으면 오류 뜸. 항상 직접 초기화.
        }
    }
}
