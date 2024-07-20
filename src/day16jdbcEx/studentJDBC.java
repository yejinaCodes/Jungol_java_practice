package day16jdbcEx;

import com.mysql.cj.MysqlConnection;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentJDBC {

  public static void main(String[] args) {
    mySqlConnection();
  }
  public static void mySqlConnection(){
    String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
    String userName = "root";
    String password = "1234";
    String query = "SELECT * FROM student";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while(rs.next()){
        String sno = rs.getString("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int english = rs.getInt("english");
        int math = rs.getInt("math");
        int science = rs.getInt("science");
        int total = rs.getInt("total");
        float average = rs.getFloat("average");
        String grade = rs.getString("grade");

        System.out.printf("no: %s name: %s korean: %d english: %d math: %d science: %d total: %d average: %.1f grade: %s\n", sno, name, korean, english, math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
