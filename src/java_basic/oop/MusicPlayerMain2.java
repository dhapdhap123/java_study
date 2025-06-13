package java_basic.oop;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("volume = " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("volume = " + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, volume = " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    
}
