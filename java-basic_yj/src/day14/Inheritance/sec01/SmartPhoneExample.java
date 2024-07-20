package day14.Inheritance.sec01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartphone1 = new SmartPhone("갤럭시24", "blue");

    //Phone으로부터 상속받은 필드 읽기
    System.out.println(smartphone1.model + " " + smartphone1.color);

    //SmartPhone의 필드 읽기
    smartphone1.bell();
    smartphone1.sendVoice("hello siri");
    smartphone1.receiveVoice("Today is sunny.");
    smartphone1.hangUp();

    //Phone으로부터 상속받은 메소드 호출

    //SmartPhone의 메소드 호출

  }
}