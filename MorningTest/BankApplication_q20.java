package MorningTest;

public class BankApplication_q20 {
  //Account_q20 type으로 만들기
  Account_q20 [] bankAccount = new Account_q20[100];

  void in(int who, int deposit){
    this.bankAccount[who].balance += deposit;
  }
  void out(int who, int withdraw){
    if(this.bankAccount[who].balance >= withdraw){
      this.bankAccount[who].balance -= withdraw;
    }
    else{
      System.out.println("잔액이 부족합니다.");
    }
  }
}
