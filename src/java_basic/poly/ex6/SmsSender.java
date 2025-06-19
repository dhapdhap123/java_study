package java_basic.poly.ex6;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 전송 : " + message);
    }
}
