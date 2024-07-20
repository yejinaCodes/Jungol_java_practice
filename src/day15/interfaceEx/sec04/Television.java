package day15.interfaceEx.sec04;

public class Television implements RemoteControl {

  //필드
  private int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("TV를 켭니다.");
  }

  //turnOff() 추상 메소드 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("TV를 끕니다.");
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
  //필드 필요
  private int rememberVolume;

  @Override
  public void setMute(boolean mute) {
    if(mute){
      this.rememberVolume = this.volume;
      System.out.println("쉿 조용히");
      setVolume(MIN_VOLUME);
    }else{
      System.out.println("무음 해제");
      setVolume(rememberVolume);
    }
  }
}