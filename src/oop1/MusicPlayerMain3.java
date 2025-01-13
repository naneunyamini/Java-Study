package oop1;


public class MusicPlayerMain3 {
    public static void main(String[] args) {

        //데이터의 묶음
       MusicPlayerData data = new MusicPlayerData();

        data.isOn = true; //음악 켜기
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
        //음악 플레이어 상태

        System.out.println("음악 플레이어 상태:");
        if (data.isOn) {
            System.out.println("ON" +data.volume);
        }else{
            System.out.println("OFF");
        }
        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
