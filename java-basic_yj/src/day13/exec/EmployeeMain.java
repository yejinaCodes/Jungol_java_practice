package day13.exec;

import day13.VO.RempVO;

public class EmployeeMain {

  public static void main(String[] args) {
    RempVO vo = new RempVO("홍길동", 30, "010-1111-4354", "2024-06-28", true, "홍보부");
    System.out.println(vo.toString());
  }
}
