package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        while(true){
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료 ");

            int option = scanner.nextInt();

            /*
            int totalPrice = 0; 내부에서 초기화했기 때문에 값이 누적되지 않고
            한번의 반복에서만 합산이 된다. 결제를 하더라도 이미 매 반복 초기화가 되기
            때문에 option==2의 동작에는 의미가 없음
             */


            if(option == 1) {
                System.out.print("상품명을 입력해주세요: ");
                String name = scanner.next();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("상품의 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;

                System.out.println("상품명: " + name + "가격: " + price + "수량: " + quantity + "합계: " + price*quantity);
                }
            else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            }
            else if (option == 3) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
            else{
                System.out.println("올바른 옵션을 선택해주세요!");
            }

        }
    }
}