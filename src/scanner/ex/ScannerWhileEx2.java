package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("상품의 가격을 입력하세요(-1을 입력하면 종료): ");
            int price = scanner.nextInt();


            if ( price == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            System.out.println("총 비용: " + price * quantity);

            // 계속 정수만 입력받을 경우에는 scanner.nextInt(); 따로 필요하지 않음
        }
    }
}
