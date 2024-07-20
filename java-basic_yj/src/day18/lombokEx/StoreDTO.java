package day18.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString //(exclude = "shopType")
@RequiredArgsConstructor //기본생성자
@AllArgsConstructor
@EqualsAndHashCode(of = {"shopName"}) //클래스에 대한 equals(), hashCode() -> 그 객체가 참고하고 있는 hash값을 string으로 보냄, 2개의 객체가
@Builder
//같은 객체인지 확인
public class StoreDTO {
  @Setter
  private String shopName; //가게 이름

  @ToString.Exclude
  private String shopTypeCode; //가게 업종 코드
  private String shopTele; //가게 전화번호
  private String shopType; //업종명
  private String shopAddr; //가게 주소


}
