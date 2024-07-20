package day15.interfaceEx.sec07;

public class SmartTelevision implements RemoteControl, Searchable{
  //구현 객체는 여러개의 인터페이스를 implements할 수 있다.
  //구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면, 인터페이스를 통해 구현 객체를 사용할 수 있다.

  @Override
  public void turnOn() {
    System.out.println("SmartTelevision on");
  }

  @Override
  public void turnOff() {
    System.out.println("SmartTelevision off");
  }

  @Override
  public void search(String url) {
    System.out.println(url + " 의 검색을 시작합니다.");
  }

  @Override
  public void setMute(boolean mute) {
    RemoteControl.super.setMute(mute);
  }

  @Override
  public void setVolume(int volume) {
    RemoteControl.super.setVolume(volume);
  }
  //turnOn() 추상 메소드 오버라이딩

  //turnoff() 추상 메소드 오버라이딩

  //search() 추상 메소드 오버라이딩

}		