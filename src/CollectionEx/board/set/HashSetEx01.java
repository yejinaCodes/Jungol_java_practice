package CollectionEx.board.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import jdk.swing.interop.SwingInterOpUtils;

public class HashSetEx01 {

  public static void main(String[] args) {
    //hashset collection 생성
    Set<String> set = new HashSet<>();

    //객체 저장
    set.add("신세계");
    set.add("신세계1");
    System.out.println(set.size());
    System.out.println("=========================");

    Set<Member> memberlist = new HashSet<Member>();

    memberlist.add(new Member("ssg", 20));
    memberlist.add(new Member("grace", 10));
    memberlist.add(new Member("kelly", 6));
    memberlist.add(new Member("ssg", 20));

    System.out.println(memberlist.size());
    System.out.println("============Iterator 사용=================");
    //Iterator 사용하기
    Iterator<Member> iterator = memberlist.iterator();
    while(iterator.hasNext()){
      Member member = iterator.next();
      System.out.println(member.name + "\t" + member.age);
      if(member.name.equals("grace")) iterator.remove();
    }

    Iterator<Member> iterator1 = memberlist.iterator();
    System.out.println();
    System.out.println("member ssg 삭제");
    while(iterator1.hasNext()){
      Member member = iterator1.next();
      System.out.println(member.name + "\t" + member.age);
      //if(member.name.equals("ssg")) memberlist.remove(member);
      if(member.name.equals("ssg")) iterator1.remove();
    }



    System.out.println("================enhanced for 사용=============");
    //회원을 enhanced for for를 이용해서 가져오기
    for(Member member: memberlist){
      System.out.println(member.name + "\t" + member.age);
    }


    System.out.println(memberlist.size());





  }
}
