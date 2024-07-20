package day15.interfaceEx.sec07;

public interface RemoteControl {
  //static void

  //추상 메소드
  void turnOn();

  void turnOff();

  //default 메서드로 setVolume()을 구현해주세요
  default void setVolume(int volume){
    System.out.println("볼륨 조정");
    this.setVolume(volume);
  }
  default void setMute(boolean mute){
    System.out.println("쉿 조용히");
  }
}