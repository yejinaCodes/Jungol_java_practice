package MorningTest;

public class Account {
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000; //상수
  private int balance;

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int balance) {
    if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE){
      return;
    }
    this.balance = balance;
//    int money = getBalance();
//    System.out.println(money + " 입금되었습니다.");
  }

}
