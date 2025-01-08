package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("hello\n");
        System.out.println("hello"); // 둘은 서로 같은 기능

        System.out.print("문자열을 입력하라:");
        String str = scanner.nextLine(); //입력을 String으로 가져옴 ( 엔터 \n을 입력할 때까지의 문자를 가져옴)
        System.out.println("입력한 문자열:"+str);

        System.out.print("정수를 입력하라:");
        int intValue = scanner.nextInt(); //입력을 Int로 가져옴
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하라: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);

        // 이때 입력하는 타입이 달라지면 출력에서 오류 발생
    }
}
