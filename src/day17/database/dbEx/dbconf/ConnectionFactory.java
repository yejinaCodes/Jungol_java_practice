package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  //connectionfactory에 mysql server로 부터 connection을 얻어오는 open()메소드를 작성하시오
  //조건: 싱글톤 패턴을 적용하여 만들기

  private static String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase?characterEncoding=UTF-8&serverTimezone=UTC";
  private static String name = "root";
  private static String pwd = "1234";

  private static Connection connection = null;

  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory(){}
  public static ConnectionFactory getInstance() {

    return instance;
  }

  public Connection open(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(url, name, pwd);

    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }
  public void close(){
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

}
