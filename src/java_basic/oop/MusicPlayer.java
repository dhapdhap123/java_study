package java_basic.oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("플레이어 시작");
    }
    void off(){
        isOn = false;
        System.out.println("플레이어 종료");
    }
    void volumeUp(){
        volume++;
        System.out.println("현재 볼륨: " + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("현재 볼륨: " + volume);
    }
    void showVolume(){
        System.out.println("현재 볼륨: " + volume);
    }
}
