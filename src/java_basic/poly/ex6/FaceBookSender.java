package java_basic.poly.ex6;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 전송 : " + message);
    }
}
