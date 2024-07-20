package MorningTest;

public class Q16 {

  public static void main(String[] args) {
    Memberservice memberservice = new Memberservice();
    boolean result = memberservice.login("hong", "12345");
    if(result){
      System.out.println("로그인 되었습니다.");
      memberservice.logout("hong");
    }else{
      System.out.println("아이디 혹은 비밀번호가 맞지 않습니다.");
    }
  }
}
