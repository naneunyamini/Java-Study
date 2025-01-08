package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("문자열을 입력하라 : ");
            String str = scanner.nextLine();

            if(str.equals("exit")){ // str일 때는 == 가 아닌 equals 사용
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("입력한 문자열" + str);
        }
    }
}
