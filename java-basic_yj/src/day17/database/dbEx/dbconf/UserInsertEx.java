package day17.database.dbEx.dbconf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase?characterEncoding=UTF-8&serverTimezone=UTC";
    String id = "root";
    String pwd = "1234";

    String query = "INSERT INTO users(userid, username, userage, useremail)" + "VALUES (?,?,?,?)";

    try {
      connection = DriverManager.getConnection(url,id,pwd);

      //PreparedStatement 객체 생성하여 퀴리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);

      //PreparedStatement 객체 파라미터(?) 에 순서대로 값 할당하기.
      pstmt.setString(1, "winter");
      pstmt.setString(2, "olaf");
      pstmt.setInt(3, 2);
      pstmt.setString(4, "elsalove@gmail.com");
      //query문 작업
      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 :" + rows);
      pstmt.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if(connection != null){
        try{
          //서버와 연결 끊기
          connection.close();
          System.out.println("bye!");
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }


  }
}
