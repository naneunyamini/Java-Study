package access;

public class SpeakerMain {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);

        speaker.volumUp();
        speaker.showVolume();

        speaker.volumUp();
        speaker.showVolume();

        speaker.volumDown();
        speaker.showVolume();

        System.out.println("필드 직접 접근 수정");
//        speaker.volume = 200; //private 접근 오류 발생
        speaker.showVolume();
    }
}
