package Homework.prob0709;

import java.util.Objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class Owner {
  private String name;
  private String cellPhone;

  public Owner(String name, String cellPhone) {
    this.name = name;
    this.cellPhone = cellPhone;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Owner owner) {
      if(this.name.equals(owner.getName())){
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "이름은 " +
        name + "이고, 핸드폰 번호는 " +
        cellPhone + "입니다.";
  }
}
