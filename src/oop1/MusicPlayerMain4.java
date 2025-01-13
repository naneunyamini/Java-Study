package oop1;


public class MusicPlayerMain4 {
    public static void main(String[] args) {

        /*
        메서드 추출
         */

        MusicPlayerData data = new MusicPlayerData();

        //음악 켜기
        on(data);
        //볼륨 증가
        volumnUp(data);
        volumnUp(data);
        //볼륨 감소
        volumnDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 끄기
        off(data);
    }

    public static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    public static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    public static void volumnUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    public static void volumnDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    public static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태:");
        if (data.isOn) {
            System.out.println("ON: " + "음악 플레이어 볼륨 "+ data.volume);
        }else{
            System.out.println("OFF");
        }
    }
}


