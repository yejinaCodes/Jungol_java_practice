package Homework;

import Homework.dao.DBConnection;
import Homework.service.BoardService;

import java.io.*;
import java.sql.*;

public class BoardExample {
    private static ResultSet rs = null;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException, SQLException {
        DBConnection connect = new DBConnection();
        Connection connection = connect.open();

        try{
            System.out.println("connection = " + connection);

            //BoardExample board = new BoardExample();
            Boolean flag = false;

            while (!flag){
                BoardService.list(connection);
                BoardService.mainMenu();

                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    //쓰기
                    case 1:
                        BoardService.create(connection);
                        break;
                    //읽기
                    case 2:
                        BoardService.read(connection);
                        break;
                    //전체 삭제
                    case 3:
                        BoardService.clear(connection);
                        break;
                    //exit
                    case 4:
                        System.out.println("** 게시판 종료 ** ");
                        flag = true;
                        break;
                }
            }

        } finally{
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("end db connection");
                }catch(SQLException e){
                    System.err.println(e.getMessage());
                }
            }
        }
    }

}
