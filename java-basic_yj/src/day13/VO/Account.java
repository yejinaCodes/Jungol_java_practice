package day13.VO;

public class Account {
  private String accId;
  private long balance;
  private String ownerName;

  public Account(){}
  public Account(String accId, long balance, String ownerName){
    this.accId = accId;
    this.balance = balance;
    this.ownerName = ownerName;
  }
  public void deposit(long amount){
    this.balance = this.balance + amount;
    //System.out.println("deposit" + amount);
  }
  public void withdraw(long amount){
    this.balance = this.balance - amount;
    //System.out.println("withdraw" + amount);
  }

  public String getAccId() {
    return accId;
  }

  public long getBalance() {
    return balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setAccId(String accId) {
    this.accId = accId;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
}

