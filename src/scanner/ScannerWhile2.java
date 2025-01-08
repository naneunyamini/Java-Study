package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("num1을 입력하라");
            int num1 = scanner.nextInt();

            System.out.print("num2를 입력하라");
            int num2 = scanner.nextInt();


            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 수의 합은: " + sum);
            // 효율적이고 불필요한 계산을 줄이기 위해 어디에 sum 출력문이 들어갈지 순서를 생각하기
        }

    }
}
