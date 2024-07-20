package day13.VO;

public class DempVO extends Employee {
  String period;

  public DempVO(){
    super();
  }

  public DempVO(String name, int age, String phone, String empDate, String dept, boolean marriage,
      String period) {
    super(name, age, phone, empDate, dept, marriage);
    this.period = period;
  }
}
