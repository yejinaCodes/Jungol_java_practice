package day13.VO;

public class MempVO extends Employee {
  String mdept;

  public MempVO(String mdept){
    this.mdept = mdept;
  }


  public MempVO(String name, int age, String phone, String empDate, String dept, boolean marriage,
      String mdept) {
    super(name, age, phone, empDate, dept, marriage);
    this.mdept = mdept;
  }
}
