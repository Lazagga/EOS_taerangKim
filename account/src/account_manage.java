import java.util.Scanner;

interface interface_account {
    void deposit(int money);
    void withdraw(int money);
    void showBalance();
}

class Account implements interface_account{
    private String accountNo;
    private int balance;

    Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if (this.balance < money) System.out.println("잔고 부족!");
        else this.balance -= money;
    }

    public void showBalance() {
        System.out.println("계좌번호 : " + this.accountNo);
        System.out.println("잔액 : " + this.balance);
    }
}

public class account_manage {
    public static void main(String[] args) {
        Account acc = new Account("110-464-167257");
        Scanner scan = new Scanner(System.in);
        int ans = 0;

        while(ans != 4) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");
            ans = scan.nextInt();

            switch (ans) {
                case 1:
                    System.out.print("예금액>");
                    acc.deposit(scan.nextInt());
                    break;
                case 2:
                    System.out.print("출금액>");
                    acc.withdraw(scan.nextInt());
                    break;
                case 3:
                    acc.showBalance();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("입력 오류!");
                    break;
            }
            System.out.println("");
        }
    }
}
