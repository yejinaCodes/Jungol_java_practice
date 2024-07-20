package MorningTest;

import java.util.Scanner;

public class Q20 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankApplication_q20 ba = new BankApplication_q20();

    int accountIndex = 0;
    boolean flag = true;

    while(flag){
      System.out.println("-------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("-------------------------------------------");
      System.out.print("선택> ");
      int menu = sc.nextInt();
      System.out.println("--------");

      //예외처리
      if(menu < 1 | menu > 5){
        System.out.println("1~5 메뉴를 선택해주세요.");
      }

      //계좌 생성하기
      else if(menu == 1){
        System.out.println("계좌생성");
        System.out.println("--------");
        Account_q20 account = new Account_q20();
        System.out.print("계좌번호: ");
        account.accountNum = sc.next();;
        System.out.print("계좌주: ");
        account.accountOwner = sc.next();
        System.out.print("초기입금액: ");
        account.balance = Integer.parseInt(sc.next());

        ba.bankAccount[accountIndex] = account;
        System.out.println("결과: 계좌가 생성되었습니다. ");
        accountIndex++;
      }

      //계좌목록 확인하기
      else if (menu == 2) {
        System.out.println("계좌목록");
        System.out.println("--------");
        for(int i=0; i<accountIndex; i++){
          System.out.println(ba.bankAccount[i].accountNum + "\t" + ba.bankAccount[i].accountOwner + "\t" + ba.bankAccount[i].balance);
        }
      }

      //예금
      else if(menu == 3){
        boolean exist = false;
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String whichAccount = sc.next();
        System.out.print("예금액: ");
        int deposit = sc.nextInt();
        for(int i=0; i<accountIndex; i++){
          if (ba.bankAccount[i].accountNum.equals(whichAccount)){
            ba.in(i, deposit);
            exist = true;
            break;
          }
        }
        if(!exist){
          System.out.println("계좌번호 존재하지 않음.");
        }
      }

      //출금
      else if(menu == 4){
        boolean exist = false;
        System.out.println("출금");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String whichAccount = sc.next();
        System.out.print("출금액: ");
        int withdraw = sc.nextInt();
        for(int i=0; i<accountIndex; i++){
          if(ba.bankAccount[i].accountNum.equals(whichAccount)){
            ba.out(i,withdraw);
            exist = true;
            break;
          }
        }
        if(!exist){
          System.out.println("계좌번호 존재하지 않음.");
        }
      }

      //종료
      else if(menu == 5){
        flag = false;
        System.out.println("프로그램 종료");
      }
    }
  }
}
