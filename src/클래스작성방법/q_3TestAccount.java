package 클래스작성방법;

public class q_3TestAccount {
  public static void main(String[] args) throws Exception {

    String accNo = null;
    int balance = 0;

    q_3Account accObj = new q_3Account();
    accObj.setAccNo("078-3762-293");
    accNo = accObj.getAccNo();
    balance = accObj.getBalance();
    System.out.println(accNo + " 계좌가 개설되었습니다.");
    System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

    accObj.save(100);
    balance = accObj.getBalance();
    System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

    accObj.deposit(30);
    balance = accObj.getBalance();
    System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
  }

}
