// 사용자 정의 예외 클래스 (Unchecked Exception)
//public class InsufficientBalanceException extends RuntimeException{
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

// 은행 계좌 클래스
class Bank_Account{
    private String accountNumber;
    private int balance;

    public Bank_Account(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");
        }
        if(balance < amount){
            throw new InsufficientBalanceException("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다");
        System.out.println("현재 잔액: " + balance + "원");
    }

    public static void main(String[] args) {
        Bank_Account bankAccount = new Bank_Account("1234-456",100);
        bankAccount.withdraw(200);
    }
}
