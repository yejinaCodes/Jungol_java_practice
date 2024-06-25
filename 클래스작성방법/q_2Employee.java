package 클래스작성방법;

public class q_2Employee {
  private String name;
  private int age;
  private String dept;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getAge() {
    return age;
  }
  public void print(){
    System.out.println("이름 : " + this.getName() + "\t\t나이 : " + this.getAge() + "\t\t부서 : " + this.getDept());
  }
}
