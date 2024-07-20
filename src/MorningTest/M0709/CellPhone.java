package MorningTest.M0709;
import lombok.Getter;

@Getter
public class CellPhone {
  private String model;
  private double battery;

  public void call(int time){
    //배터리 영운 0보다 작아지지 않는다.
    if(time>0){
      System.out.println("통화 시간 : " + time +"분");
      if(this.battery >= time * 0.5){
        this.battery -= time * 0.5;
      }else{
        this.battery = 0;
      }
    }else{
      throw new IllegalArgumentException("통화시간입력오류");
    }
  }
  public void charge(int time) {
    //배터리 양은 100까지만 증가한다.
    if (time > 0) {
      System.out.println("충전 시간 : " + time + "분");
      if (this.battery <= 100 - (time * 3)) {
        this.battery += time * 3;
      } else {
        this.battery = 100;
      }
    } else {
      throw new IllegalArgumentException("충전시간입력 오류");
    }
  }

  public void printBattery(){
    System.out.println("남은 배터리 양 : " + this.battery);
  }

  public CellPhone(String model, double battery) {
    this.model = model;
    this.battery = battery;
  }

}
