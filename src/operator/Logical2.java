package operator;

public class Logical2 {
    public static void main(String[] args) {

        int a = 15;

        boolean result = a > 10 && a < 20; //  10 <a && a < 20 이 경우가 읽기 좀 더 편함 !
        System.out.println("result: " + result);

    }
}
