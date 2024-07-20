package Homework.prob0709;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
  private Owner owner;
  private int price;

  @Override
  public boolean equals(Object o) {
    if (o instanceof Vehicle vehicle) {
      if(this.owner.equals(vehicle.getOwner())){
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "소유주정보 : " +
        "이름은 " + owner.getName() +
        "이고, 핸드폰 번호는 " + owner.getCellPhone() +
        "입니다." + "\n" +
        "차량정보 : 가격은 " +  this.price + " 입니다.";
  }
}
