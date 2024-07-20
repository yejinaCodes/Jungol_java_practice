package day18.objecEx;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member1 = new Member("ssg", 30, new Address(10101, "서울시 영등포구"));
    try{


      Member member2 = member1.clone();
      Address address1 = member1.getAddr();
      Address address2 = member2.getAddr();
      //address2.setAddr("부산직할시 해운대");

      System.out.printf("address1 hashcode : %s, addr ; %s\n", member1, member1.getAddr());
      System.out.printf("address2 hashcode : %s, addr ; %s\n", member2, member2.getAddr());
      System.out.printf("member1 hashcode : %s, addr ; %s\n", address2, address2.getAddr());
      System.out.printf("member2 hashcode : %s, addr ; %s\n", address2, address2.getAddr());


//      System.out.println(member1);
//      System.out.println(member2);
//
//
//      Address address1 = new Address(10002, "서울시 동대문구");
//      String addr = member1.getAddr();
//      address1.setAddr(address1);
//      System.out.println(member2);
      //Address address2 = member2.getAddress();
    }catch(CloneNotSupportedException e){
      throw new RuntimeException(e);
    }
  }
}
