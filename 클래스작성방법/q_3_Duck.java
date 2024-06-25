package 클래스작성방법;

public class q_3_Duck {
  private String name;
  private int legs;
  private int length;
  private String flyable;
  private String singable;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void fly(){
    this.flyable = "날지 않습니다.";
  }
  public void sing(){
    this.singable =  "소리내어 웁니다.";
  }
  public String toString(){
    return "오리(" + this.getName() + ")는 " + this.flyable + "\n" +
        "오리(" + this.getName() + ")는 " + this.singable + "\n" +
        "오리의 이름은 " + this.getName() + "입니다.";
  }
}
