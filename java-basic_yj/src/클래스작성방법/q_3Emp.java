package 클래스작성방법;

public class q_3Emp {
  private String id;
  private String name;
  private int baseSalary;

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBaseSalary() {
    return baseSalary;
  }
  public double getSalary(double bonus){
    double salary = this.getBaseSalary() + this.getBaseSalary()*bonus;
    return salary;
  }
  public String toString(){
    return this.getName() + "(" + this.getId() + ") 사원의 기본급은" + this.getBaseSalary() + "원 입니다.";
  }

}
