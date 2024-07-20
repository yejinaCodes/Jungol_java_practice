package day14.Inheritance.sec02.exam02;

public class SmartPhone extends Phone {
  private boolean wifi;

  //자식 생성자 선언
  public SmartPhone(){}
  public SmartPhone(String model, String color, boolean wifi) {
    super(model, color);
    this.wifi = wifi;
  }

  public String getWifi(){
    String message = "";
    if(this.wifi == true){
      message = "wifi 사용중";
    }else{
      message = "wifi 꺼짐";
    }
    return message;
  }
  public void setWifi(boolean wifi){
    this.wifi = wifi;
    if(this.wifi == true){
      System.out.println("wifi on");
    }
    else{
      System.out.println("wifi off");
    }
  }
}