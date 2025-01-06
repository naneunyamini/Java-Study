package casting;

public class Casting3 {

    public static void main(String[] args) {
        //오버플로우
        long maxIntValue = 2147483647L; //int 최고값
    /* 이 경우에는 int의 범위를 넘어가므로 오류
     long maxIntValue = 2147483648;
     */
        long maxIntOver = 2147483648L;// int 최고값 + 1(초과)
        int intValue =0;

        intValue = (int) maxIntValue; //형변환 : 출력 2147483647
        System.out.println("intValue = " + intValue);

        /* int의 값을 초과한 경우 -> int의 가장 작은 범위부터 다시 시작
           출력 -2147483648 -> 범위를 넘어섬 : 오버플로우
         */
        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);
    }

}
