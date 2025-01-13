package oop1;

public class MusicPlayer {

    int volume =0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumnUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:"+volume);
    }
    void volumnDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:"+volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태:");
        if (isOn) {
            System.out.println("ON: " + "음악 플레이어 볼륨 "+ volume);
        }else{
            System.out.println("OFF");
        }
    }
}
