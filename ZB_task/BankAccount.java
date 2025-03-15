// 추상 클래스로 변경
abstract class BankAccount{
    // 필드
    private String accountNumber;   // 계좌번호
    private String owner;   // 예금주
    protected int balance;    // 잔액
    private static int totalAccount;    // 전체 계좌 수

    // 생성자
    public BankAccount(String accountNumber, String owner){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
        totalAccount++;
    }

    // 메서드
    // 1. 입금
    public void deposit(int amount){
        if(amount>0){
            balance += amount;
        }
    }

    // 2. 출금 (추상 메서드로 변경 -> 계좌 종류별로 구현을 다르게 하기 위함)
    abstract boolean withdraw(int amount);

    // 3. 잔액 조회
    public int getBalance() {
        return balance;
    }
    public String getOwner(){
        return owner;
    }
    public static int getTotalAccount(){
        return totalAccount;
    }

    public static void main(String[] args){
        // 1. 계좌 생성
        NormalAccount account1 = new NormalAccount("1111-2222","홍길동");
        MinusAccount account2 = new MinusAccount("3333-4444","김철수",1000000);
        // BankAccount account3 = new BankAccount("6666-7777","김민수");

//        // 2. 입금 테스트
//        account1.deposit(50000);
//        System.out.println(account1.getOwner() + "님의 잔액 : " + account1.getBalance());
//
//        account2.deposit(10000);
//        System.out.println(account2.getOwner() + "님의 잔액 : " + account2.getBalance());
//
//        // 3. 출금 테스트
//        boolean withdraw = account1.withdraw(30000);
//        if(withdraw){
//            System.out.println("출금 성공!");
//            System.out.println("현재 잔액 : " + account1.getBalance());
//        }else{
//            System.out.println("출금 실패...");
//        }
//
//        // 4. 잔액 부족 테스트
//        if (account1.withdraw(100000)){
//            // 10만원 출금 시도
//            System.out.println("출금 성공");
//        }else{
//            System.out.println("잔액이 부족합니다");
//            System.out.println("현재 잔액: " + account1.getBalance());
//        }
//
//        // 5. 전체 계좌 수 확인
//        System.out.println("전체 계좌 수: " + bankAccount.getTotalAccounts());


        // 2. 입금
        account1.deposit(50000);
        account2.deposit(50000);

        System.out.println("==== 일반 계좌 출금 ====");
        System.out.println("현재 잔액: " + account1.getBalance());

        // 7만원 출금 시도
        if(account1.withdraw(70000)){
            System.out.println("출금 성공!");
        }else {
            System.out.println("출금 실패!");
        }


        System.out.println("==== 마이너스 계좌 출금 ====");
        System.out.println("현재 잔액: " + account2.getBalance());

        // 7만원 출금 시도
        if(account2.withdraw(70000)){
            System.out.println("출금 성공!");
            System.out.println("현재 잔액: " + account2.getBalance());
        }else {
            System.out.println("출금 실패!");
        }
    }

    // 일반 계좌
    static class NormalAccount extends BankAccount{
        public NormalAccount(String accountNumber, String owner){
            super(accountNumber, owner);
        }

        @Override
        boolean withdraw(int amount) {
            if(amount>0 && balance >= amount){
                balance -= amount;
                return true;
            }
            return false;
        }
    }
    // 마이너스 계좌
    static class MinusAccount extends BankAccount{
        private int minusLimit;
        public MinusAccount(String accountNumber, String owner, int minusLimit){
            super(accountNumber, owner);
            this.minusLimit = minusLimit;
        }
        boolean withdraw(int amount){
            // 잔액 + 마이너스 한도액까지 출금 가능
            if(amount>0 && balance+minusLimit>=amount){
                balance -= amount;
                return true;
            }
            return false;
        }
    }
}