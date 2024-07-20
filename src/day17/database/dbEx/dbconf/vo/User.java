package day17.database.dbEx.dbconf.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data //아래 annotation을 모두 아우르는 것임.
//@Getter //compile시 필드들에 대한 getter method를 다 생성해준다.
//@Setter //setter method를 자동으로 만들어준다.
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor //기본 생성자를 만들 필요없다.
//@AllArgsConstructor //모든 field들에 대한 constructor를 제공해준다.

public class User {
  private String userid;
  private String username;
  private int userage;
  private String useremail;

  public User(){};
//  public User(String id, String name, int age, String email){
//    this.userid = id;
//    this.username = name;
//    this.userage = age;
//    this.useremail = email;
//  }
//
//  public String getUserid() {
//    return userid;
//  }
//
//  public void setUserid(String userid) {
//    this.userid = userid;
//  }
//
//  public String getUsername() {
//    return username;
//  }
//
//  public void setUsername(String username) {
//    this.username = username;
//  }
//
//  public int getUserage() {
//    return userage;
//  }
//
//  public void setUserage(int userage) {
//    this.userage = userage;
//  }
//
//  public String getUseremail() {
//    return useremail;
//  }
//
//  public void setUseremail(String useremail) {
//    this.useremail = useremail;
//  }
//
//  @Override
//  public String toString() {
//    return "User{" +
//        "userid='" + userid + '\'' +
//        ", username='" + username + '\'' +
//        ", userage=" + userage +
//        ", useremail='" + useremail + '\'' +
//        '}';
//  }
}
