package day15.interfaceEx.sec04;

public class RemoteControlExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언
    RemoteControl rc;
    //Television 객체를 생성하고 인터페이스 변수에 대입
    rc = new Television();
    rc.turnOn();
    rc.setVolume(3);

    //디폴트 메소드 호출
    rc.setMute(true);
    rc.setMute(false);

    System.out.println();

    //Audio 객체를 생성하고 인터페이스 변수에 대입

    //디폴트 메소드 호출

  }
}