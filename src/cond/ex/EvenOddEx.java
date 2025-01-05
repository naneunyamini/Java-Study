package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int num = 7;

        String result = ( num % 2 == 0) ? "찍수" : "홀수";
        System.out.println("num = " + num +  ", " + result);

    }

    /* switch문 경우
      public static void main(String[] args) {
        int num = 7;

        String result;
        switch (num % 2) {
            case 0:
                result = "짝수";
                break;
            default:
                result = "홀수";
        }
     */
}
