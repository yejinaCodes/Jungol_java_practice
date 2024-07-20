package 클래스작성방법;

public class q_3Prob1 {

  public static void main(String[] args) {

    q_3Emp emp = new q_3Emp();
    emp.setId("12345");
    emp.setName("홍길동");
    emp.setBaseSalary(50000);
    System.out.println( emp.toString() );
    System.out.println( "봉급 = " + emp.getSalary( 30 ) );

  }

}
