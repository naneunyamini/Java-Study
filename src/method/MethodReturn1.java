package method;

public class MethodReturn1 {

    public static void main(String[] args) {

        boolean result = odd(1);
        System.out.println(result);

    }
    public static boolean odd(int i){
        if(i%2 == 1){
            return true;
        } else{
            return false;
        }

    }//반환하는값이 존재한는 경우에는 반드시 return값이 필요함
    // : 컴파일 오류 java: missing return statement
    // 따라서 true가 아닌 false인 경우도 추가해줘야함
}
