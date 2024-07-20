package day14.Inheritance.sec09.exam01;

public class SmartPhone extends Phone {

  //private String receiveMember;
  @Override
  void sendVoice() {
  }

  @Override
  void receiveVoice() {
  }

  SmartPhone(){
  }
  //생성자 선언
  SmartPhone(String owner){
    super(owner);
  }

  //메소드 선언
  void internetPlay(){
    System.out.println("인터넷 검색 기능을 실행합니다. ");
  }

}