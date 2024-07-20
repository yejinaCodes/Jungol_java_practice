package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {
  static Connection connection = null;

  public static void main(String[] args) {
    connection = ConnectionFactory.getInstance().open();
    String query = new StringBuilder()
        .append("DELETE FROM ")
        .append("users WHERE userid = ? ")
        .toString();

    try{
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, "winter");

      int rows = pstmt.executeUpdate();
      System.out.println("수정된 행의 수: " + rows);
      pstmt.close();
    } catch (
        SQLException e) {
      System.err.println(e.getMessage());;
    }finally{
      ConnectionFactory.getInstance().close();
    }
  }

}


