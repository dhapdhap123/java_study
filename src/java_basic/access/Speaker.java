package java_basic.access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if (volume >= 100){
            System.out.println("음량 증가 불가. 최대 음량");
        } else {
            volume += 10;
            System.out.println("음량10증가");
        }
    }
    void volumeDown(){
        volume -= 10;
    }
    void showVolume(){
        System.out.println("volume = " + volume);
    }
}
