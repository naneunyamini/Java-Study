package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance=0;

        while(true){
            System.out.println("-----------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("-----------------------------");
            System.out.print("선택: ");

            int option = scanner.nextInt();


            if (option == 1){
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);
            }else if (option == 2){
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            }else if (option == 3){
                System.out.print("현재 잔액: ");
            }else if (option == 4){
                System.out.println("시스템을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 번호를 선택하세요");
            }

        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount +"원을 입금하였습니다. 현재 잔액: "+balance+"원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+"원을 출금하였습니다. 현재 잔액: "+balance+"원");
        }else{
            System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
