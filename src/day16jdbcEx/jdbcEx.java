//package day16jdbcEx;
//
//import day14.Inheritance.sec09.exam01.Phone;
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class jdbcEx {
//
//  public static void main(String[] args) {
//    //회원의 정보를 사용자 받는 기능(static 메소드로)
//    //Member class(VO) 만들기
//    //memberInsert(Member member);
//    memberUpdate();
//    memberDelete();
//    membersearch();
//  }
//
//  private static void memberDelete() {
//  }
//
//  private static void memberUpdate() {
//  }
//
//  private static void memberInsert() {
//    String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
//    String userName = "root";
//    String password = "1234";
//    String query = "INSERT INTO member VALUES(?,?,?)";
//
//    Connection con = null;
//    PreparedStatement pstmt = null; //값만 매칭할 수 있게 해줌.
//    int result = 0;
//
//    //connection: jvm 과 mysql(dbserver)과 양방향 통신을 위함.?
//    //startment는 자동차와 같음. 각각의 query를 담은 자동차와 같음.
//    //network에서 예외사항이 발생할 수 있으므로, 안전한 상태에서 통신을 가능하게 함.
//
//    try{
//      //Class.forName("com.mysql.cj.jdbc.Driver"); //최근 driver는 자동 로딩됨.
//      con = DriverManager.getConnection(url, userName, password);
//      System.out.println(con);
//      pstmt = con.prepareStatement(query);
//      pstmt.setInt(1, 4);
//      pstmt.setString(1, "yejin");
//      pstmt.setString(3, "unemployed");
//
//      result = pstmt.executeUpdate();
//
//      if(result == 1){
//        System.out.println("회원 정보가 입력되었습니다.");
//      }else if(result == 0){
//        System.out.println("회원 정보 입력이 실패하였습니다.");
//      }
//      pstmt.close();
//      con.close();
//
////    }catch (ClassNotFoundException e) {
////      throw new RuntimeException(e);
////    }catch(SQLException e) {
////      throw new RuntimeException(e);
////    }
//
//
//  }
//
//  //method 만들기
//  public static void membersearch(){
//    String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
//    String userName = "root";
//    String password = "1234";
//    String query = "SELECT * FROM member";
//
//    Connection con = null;
//    Statement stmt = null;
//    ResultSet rs = null;
//    //connection: jvm 과 mysql(dbserver)과 양방향 통신을 위함.?
//    //startment는 자동차와 같음. 각각의 query를 담은 자동차와 같음.
//    //network에서 예외사항이 발생할 수 있으므로, 안전한 상태에서 통신을 가능하게 함.
//
//    try{
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      con = DriverManager.getConnection(url, userName, password);
//      stmt = con.createStatement();
//      rs = stmt.executeQuery(query);
//      while(rs.next()){
//        int id = rs.getInt("id");
//        String name = rs.getString("name");
//        String job = rs.getString("job");
//        System.out.printf("id : %d name : %s job : %s", id, name, job);
//      }
//      rs.close();
//      stmt.close();
//      con.close();
//    }catch (ClassNotFoundException e){
//      throw new RuntimeException(e);
//    }catch(SQLException e) {
//      throw new RuntimeException(e);
//    }
//  }
//}
