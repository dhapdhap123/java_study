package java_mid1.exception.basic.unchecked;

/*
    RuntimeException을 상속받은 예외는 언체크 예외가 됨.
 */

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message){
        super(message);
    }
}
