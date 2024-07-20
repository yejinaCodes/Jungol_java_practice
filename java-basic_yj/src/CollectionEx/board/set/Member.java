package CollectionEx.board.set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
  public String name;
  public int age;

  @Override
  public int hashCode() {
    return name.hashCode() + age; //string은 literal pool에 존재하기 때문에 age+name 값이 해당 member의 주소값이다.
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Member member){
      return member.name.equals(name) && (member.age == age);
    }else{
      return false;
    }
  }

}
