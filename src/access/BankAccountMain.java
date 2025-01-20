package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(10000);
        account.withdraw(5000);

//        account.getBalance();
        System.out.println("balance: " + account.getBalance());
    }
}
