package 클래스작성방법;

public class q_2TestSchool {

  public static void main(String[] args) {

    q_2Student s = new q_2Student();
    s.setName("홍길동");
    s.setAge(20);
    s.setId(200201);
    q_2Teacher t = new q_2Teacher();
    t.setName("홍길동");
    t.setAge(30);
    t.setSubject("JAVA");
    q_2Employee e= new q_2Employee();
    e.setName("홍길동");
    e.setAge(40);
    e.setDept("교무과");

    s.print();
    t.print();
    e.print();
  }

}
