package day17.database.dbEx.dbconf;

import day17.database.dbEx.dbconf.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {
  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<User> userlist = new ArrayList<User>();

  public static void main(String[] args) {
    String query = "SELECT * FROM users";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();

      while(rs.next()){
        User user = new User();
        user.setUserid(rs.getString("userid"));
        user.setUsername(rs.getString("username"));
        user.setUserage(rs.getInt("userage"));
        user.setUseremail(rs.getString("useremail"));

        userlist.add(user);
        System.out.println(user.toString());
        System.out.println("회원 아이디: " + user.getUserid());
      }
      for(User user: userlist){
        System.out.println(user.getUserid());
        System.out.println(user.getUsername());
        System.out.println(user.getUseremail());
        System.out.println("-------------------");
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
