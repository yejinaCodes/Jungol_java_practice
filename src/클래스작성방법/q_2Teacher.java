package 클래스작성방법;

public class q_2Teacher {
  private String name;
  private int age;
  private String subject;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSubject() {
    return subject;
  }
  public void print(){
    System.out.println("이름 : " + this.getName() + "\t\t나이 : " + this.getAge() + "\t\t담당과목 : " + this.getSubject());
  }
}
