package day13.VO;

public class Employee {
  private String name;
  private int age;
  private String phone;
  private String addr;
  private String empDate;
  private String dept;
  private boolean marriage;

  public Employee(){
  }
  //overloading된 생성자
  public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage){
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.empDate = empDate;
    this.marriage = marriage;
    this.dept = dept;
  }

  //overloading된 생성자
  public Employee(String name, int age, String phone){
    this.name = name;
    this.age = age;
    this.phone = phone;
  }


  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", addr='" + addr + '\'' +
        ", empDate=" + empDate +
        ", dept='" + dept + '\'' +
        ", marriage=" + marriage +
        '}';
  }
}
