package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleNum = 10;
        int intNum;


        //        intNum = doubleNum; // 컴파일 오류 발생
        intNum = (int) doubleNum; // 형변환

        System.out.println((int) 10.5);
    }
}
