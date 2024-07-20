package day18.objectEqualsHashCode;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;

  @Override
  //object 끼리 비교할 경우
  public boolean equals(Object o) {
   if(o instanceof Member m){
     if(this.memberCode == m.getMemberCode() && this.name.equals(m.getName())){
       return true;
     }
   }
   return false;
  }

  @Override
  public int hashCode() {
    int result = this.name.hashCode(); //string은 literal pool에서 관리되기 때문에 값이 같게 나옴.
    return result;
  }
}
