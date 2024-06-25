package 클래스작성방법;

public class q_2Student {
  private String name;
  private int age;
  private int id;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
  public void print(){
    System.out.println("이름 : " + this.getName() + "\t\t나이 : " + this.getAge() + "\t\t학번 : " + this.getId());
  }
}
