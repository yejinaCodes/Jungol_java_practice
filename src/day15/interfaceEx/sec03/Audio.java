package day15.interfaceEx.sec03;

public class Audio implements RemoteControl {
  //약속된 method들을 구현해줘야 한다.
  private int volume;

  @Override
  public void turnon() {
    System.out.println("audio turn on");
  }

  @Override
  public void turnoff() {
    System.out.println("audio turn off");
  }

  @Override
  public void turnOn() {

  }

  @Override
  public void turnOff() {

  }

  @Override
  public void setVolume(int volume) {
    //main에서 받아온 volume값을 처리해줘야 함.
    if(volume > RemoteControl.MAX_VALUE){
      this.volume = RemoteControl.MAX_VALUE;
    }else if(volume < RemoteControl.MIN_VALUE){
      this.volume = RemoteControl.MIN_VALUE;
    }else{
      this.volume = volume;
    }
    System.out.println("audio volume: " + this.volume);
  }

  //필드

  //turnOn() 추상 메소드 오버라이딩

  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

}