package java_mid1.time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        //계산 (불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("30s 더함 = " + ofTimePlus);
    }
}
