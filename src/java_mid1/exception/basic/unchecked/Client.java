package java_mid1.exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
