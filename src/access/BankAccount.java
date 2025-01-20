package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //pubulic 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountvalid(amount)) {
            balance +=amount;
        }else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 : withdraw
    public void withdraw(int amount) {
        if(isAmountvalid(amount) && balance - amount >=0) {
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 : getBalance
    public int getBalance() {
        return balance;
    } // balance를 반환하기 때문에 메인함수에서도 sout 안에서 호출해야 결과값이 나옴


    //private 메서드 : isAmountValid
    private boolean isAmountvalid(int amount) {
        //금액이 0보다 커야함
        return amount >0;
    }
}
