package 클래스작성방법;

public class q_3Account {
  private String accNo;
  private int balance;

  public String getAccNo() {
    return accNo;
  }

  public int getBalance() {
    return balance;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }
  public void save(int in){
    System.out.println(this.getAccNo() + " 계좌에 " + in + "만원이 입금되었습니다.");
    this.setBalance(this.getBalance() + in);
  }
  public void deposit(int out){
    if(out > this.getBalance()){
      System.out.println("잔고가 부족해 출금을 할 수 없습니다.");
    } else {
      System.out.println(this.getAccNo() + " 계좌에 " + out + "만원이 출금되었습니다.");
      this.setBalance(this.getBalance() - out);
    }
  }

}
