package day15.interfaceEx.sec03;

public class Television implements RemoteControl{

  //필드
  private int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnon(){
    System.out.println("TV turn on");
  }

  @Override
  public void turnoff() {
    System.out.println("TV turn off");
  }

  @Override
  public void turnOn() {

  }

  @Override
  public void turnOff() {

  }

  @Override
  public void setVolume(int volume) {
    this.volume = volume;
  }
  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

}	