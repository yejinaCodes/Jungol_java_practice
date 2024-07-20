package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.*;

public class ConnectionEx {
  private static Connection connection = null;
  private static String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase?characterEncoding=UTF-8&serverTimezone=UTC";
  private static String id = "root";
  private static String pwd = "1234";

  public static void main(String[] args) {

    try {
      //JDBC 드라이버 등록
      Class.forName("com.mysql.cj.jdbc.Driver"); //해당 driver를 load하라는 뜻

      //연결하기
      connection = DriverManager.getConnection(url, id, pwd);
      System.out.println("connection 객체값 = " + connection);
    } catch (ClassNotFoundException | SQLException e) {
      System.err.println(e.getMessage());
    }finally{
      if(connection != null){
        //연결 끊기
        try {
          connection.close();
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());;
        }
      }
    }

  }
}
