package 클래스작성방법;

public class q_3Sparrow {
  private String name;
  private int legs;
  private int length;
  private String flyable;
  private String singable;

  public String getName() {
    return name;
  }

  public String getFlyable() {
    return flyable;
  }

  public String getSinable() {
    return singable;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFlyable(String flyable) {
    this.flyable = flyable;
  }

  public void setSingable(String sinable) {
    this.singable = sinable;
  }
  public void fly(){
    this.flyable = "날아다닙니다.";
  }
  public void sing(){
    this.singable = "소리내어 웁니다.";
  }
  public String toString(){
    return  "참새" + "(" +this.getName() + ")가 " + this.flyable + "\n" +
        "참새" + "(" + this.getName() + ")가 " + this.singable + "\n" +
        "참새의 이름은 " + this.getName() + "입니다.";
  }
}
