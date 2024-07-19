package Homework.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;
    private static String url = "jdbc:mysql://localhost:3306/board?characterEncoding=UTF-8&serverTimezone=UTC";
    private static String id = "root";
    private static String pwd = "1234";

    //private static final db_connection instance = new db_connection();
    public Connection open(){
        try{
            connection = DriverManager.getConnection(url,id, pwd);

        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
        return connection;
    }
    public void close(){
        try{
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());;
        }
    }
}
