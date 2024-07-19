package Homework;

import Homework.vo.Board;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BoardExample {
    private static ResultSet rs = null;
    private static ArrayList<Board> boardlist = new ArrayList<Board>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException, SQLException {

        try{
            //jdbc 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            //연결하기
            connection = DriverManager.getConnection(url, id, pwd);
            System.out.println("connection = " + connection);

            //BoardExample board = new BoardExample();
            Boolean flag = false;

            while (!flag){
                list();
                mainMenu();

                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    //쓰기
                    case 1:
                        create();
                        break;
                    //읽기
                    case 2:
                        read();
                        break;
                    //전체 삭제
                    case 3:
                        clear();
                        break;
                    //exit
                    case 4:
                        System.out.println("** 게시판 종료 ** ");
                        flag = true;
                        break;
                }
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }finally{
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("db connection fail");
                }catch(SQLException e){
                    System.err.println(e.getMessage());
                }
            }
        }

    }

}
