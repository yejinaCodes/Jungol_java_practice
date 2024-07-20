package day15.interfaceEx.sec04;

public class Audio implements RemoteControl {

  //필드
  private int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("Audui 를 켭니다.");
  }

  //turnOff() 추상 메소드 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("Audio 를 끕니다.");
  }

  //setVolume() 추상 메소드 오버라이딩
  @Override
  public void setVolume(int volume) {
    if (volume > MAX_VOLUME) {
      this.volume = MAX_VOLUME;
    } else if (volume < MIN_VOLUME) {
      this.volume = MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 TV 볼륨: " + volume);
  }

}