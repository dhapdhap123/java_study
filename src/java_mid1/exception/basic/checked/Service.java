package java_mid1.exception.basic.checked;

public class Service {

    Client client = new Client();

    // 예외 잡아서 처리하는 코드
    public void callCatch(){

        try {
            client.call();
        } catch(MyCheckedException e){ // Exception으로도 잡을 수 있음 (부모 >= 자식)
            // 예외 처리 로직
            System.out.println("예외 처리, message= " + e.getMessage());
        }
        System.out.println("정상 흐름");

    }

    /*
    * 체크 예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 함.
     */
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
