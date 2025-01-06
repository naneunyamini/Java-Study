package casting;

public class Casting1 {

    public static void main(String[] args) {

        // 작은 범위에서 큰 범위에 값을 대입
        int intValue = 0;
        long longValue;
        double doubleValue;

        //자동 형변환 (long) 이런 것을 사용할 필요가 없음
        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        // double은 부동 소수점을 사용함
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue = " + doubleValue);
    }
}
