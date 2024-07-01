package day13.VO;

public class CheckingAccount extends Account {

  private String cardNo;
  public CheckingAccount(){
  }

  public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
    //private일 경우는 아래처럼
    super(accid, balance, ownerName);
    //protected일 경우는
    //this.accId = accid;
    //this.ownername = ownerName;
    //this.balance = balance;
    this.cardNo = cardNo;

  }
  public void pay(String cardNo, long amount){
    if (this.cardNo.equals(cardNo) && getBalance() >= amount){
      withdraw(amount);
      //this.setBalance(this.getBalance()-amount);
    }else{
      System.out.println("지불이 불가능합니다.");
    }
  }
}
