package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기1
        String result1 = "hello" + " world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num; //이때 문자열과 어떠한 것을 더할 때 다 문자열 취급을 해줌
        System.out.println(result4);

        //자바는 문자열인 string 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 바꾼다
    }
}
