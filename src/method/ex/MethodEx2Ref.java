package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {

        String message = "Hello World!";

        //반환값이 없고 출력만 하는 경우는
        printMessage(message,3);
        printMessage(message,5);
        printMessage(message,7);

    }

    public static void printMessage(String message, int times){
        for(int i = 0; i < times; i ++){
            System.out.println(message);
        }

    }
}
