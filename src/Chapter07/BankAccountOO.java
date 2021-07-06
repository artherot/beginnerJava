package Chapter07;

class BankAccount {
    // 인트턴스 변수
    int balance = 0;         // 예금 잔액

    // 입금을 담당하는 인트턴스 메소드
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    // 출금을 담당하는 인트턴스 메소드
    public int withdraw(int amount) {
        balance -=amount;
        return balance;
    }

    // 예금 조회를 담당하는 인트턴스 메소드
    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

class BankAccountOO {
    public static void main(String[] args) {
        // 두개의 인스턴스를 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
