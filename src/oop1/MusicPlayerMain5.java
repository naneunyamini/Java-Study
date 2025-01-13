package oop1;

public class MusicPlayerMain5 {
    public static void main(String[] args) {

        //객체 지향 프로그래밍
        //다른 개발자가 (아무것도 모른는 상태에서) 호출만 함

        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumnUp();
        player.volumnUp();
        player.volumnDown();
        player.showStatus();
        player.off();

    }


}


