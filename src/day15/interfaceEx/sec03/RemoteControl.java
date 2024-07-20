package day15.interfaceEx.sec03;

public interface RemoteControl {

  //상수 필드
  public static final int MAX_VALUE = 30;
  public static final int MIN_VALUE = 0;

  //추상 메소드: 구현부가 없는 시그니처만 가지고 있는 메소드.
  abstract void turnon();
  abstract void turnoff();

  //turnOn() 추상 메소드 오버라이딩
  void turnOn();

  //turnOff() 추상 메소드 오버라이딩
  void turnOff();

  abstract void setVolume(int Volume);



}