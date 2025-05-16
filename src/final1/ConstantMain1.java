package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수"+1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수: "+currentUserCount);
        if(currentUserCount>1000){
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참가합니다.");
        }
    }
    //하지만 이 코드에서는 1000에서 2000으로 바꾼다면 2곳의 변경 포인트가 발생함 -> 따라서 상수를 이용해야하는데 ..
}
