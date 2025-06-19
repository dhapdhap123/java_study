package java_basic.poly.ex8;

public abstract class PayStore {
    public static Pay findPay(String payOption){
        return switch (payOption) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "newPay" -> new NewPay();
            default -> new DefaultPay();
        };
    }
}
