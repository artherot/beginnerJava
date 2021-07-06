package Chapter07;

class BankAccountDR {
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

public class DupRef {
    public static void main(String[] args) {
        BankAccountDR ref1 = new BankAccountDR();
        BankAccountDR ref2 = ref1;

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }
}