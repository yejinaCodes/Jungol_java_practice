package day13.VO;

public class CheckingAccount extends Account {

  public String cardNo;
  public CheckingAccount(){
  }

  public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
    super(accid, balance, ownerName);
    this.cardNo = cardNo;

  }
  public void pay(String cardNo, long amount){
    if (this.cardNo.equals(cardNo) && this.getBalance() >= amount){
      this.setBalance(this.getBalance()-amount);
    }
  }
}
