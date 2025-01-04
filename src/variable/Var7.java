package variable;

public class Var7 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2147483647 (약 20억)

        /* int i = 2147483648; -> 이렇게 되면 오류 발생 */

        //- 9223372036854775808 ~ 9223372036854775807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f; //기본이 double이기 때문에 f를 써주어야 함
        double d = 10.0; // double이 훨씬 더 큰 범위 , 정밀도가 더 높음

    }
}
