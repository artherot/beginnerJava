package Chapter07;

class BankAccountC {
    String accNumber;           // 계좌번호
    String ssNumber;            // 주민번호
    int balance = 0;            // 예금 잔액

    // 생선자
    public BankAccountC(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

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
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔  액 : " + balance + '\n');
        return balance;
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {
        BankAccountC yoon = new BankAccountC("12-34-89", "990910-9090990", 10000);           // 계좌 생성
        BankAccountC park = new BankAccountC("33-55-09", "770808-5990990", 10000);           // 계좌 생성

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}