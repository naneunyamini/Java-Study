package oop1;


public class MusicPlayerMain1 {
    public static void main(String[] args) {

        //절차 지향 프로그래밍
        int volume = 0;
        boolean isOn = false;

        isOn = true; //음악 켜기
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨:"+volume);
        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨:"+volume);
        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨:"+volume);
        //음악 플레이어 상태

        System.out.println("음악 플레이어 상태:");
        if (isOn) {
            System.out.println("ON" +volume);
        }else{
            System.out.println("OFF");
        }
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
