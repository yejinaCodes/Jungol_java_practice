package day17.database.dbEx.dbconf;

import day17.database.dbEx.dbconf.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {
  static Connection connection = null;
  static ResultSet rs = null;
  public static void main(String[] args) {
    String query = "SELECT userid,username,userage,useremail " +
        "FROM users " +
        "WHERE userid=?";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1,"winter");

      rs = pstmt.executeQuery();
      if(rs.next()){
        User user = new User();
        user.setUserid(rs.getString("userid"));
        user.setUsername(rs.getString("username"));
        user.setUserage(rs.getInt("userage"));
        user.setUseremail(rs.getString("useremail"));

        System.out.println(user.toString());
      }else{
        System.out.println("해당 회원은 존재하지 않습니다.");
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }finally{
      ConnectionFactory.getInstance().close();
    }


  }

}
