package casting;

public class Casting2 {

    public static void main(String[] args) {

        //큰 범위에서 작은 범위로 형변환
        
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; 컴파일 오류 발생함
        intValue = (int)doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue);


        System.out.println((int)10.6);
    }
}
