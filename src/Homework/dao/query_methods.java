package Homework.dao;

import Homework.exception.Exception_class;
import Homework.vo.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class query_methods {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Exception_class exobj = new Exception_class();

    public Boolean insert_db(Connection connection, Board board) throws IOException {
        String query = "INSERT INTO board_site(writer, date, title, content)" + "VALUES(?,?,?,?)";

        int confirm = Integer.parseInt(br.readLine());
        try{
            if(confirm == 1){
                //db에 저장하기
                PreparedStatement pstmt = connection.prepareStatement(query);
                //pstmt.setString(1, String.valueOf(number));
                pstmt.setString(1, board.getBwriter());
                pstmt.setString(2, String.valueOf(board.getBdate()));
                pstmt.setString(3, board.getBtitle());
                pstmt.setString(4, board.getBcontent());

                pstmt.executeUpdate();
                pstmt.close();
                return true;

            } else if (confirm == 2) {
                System.out.println();
                return true;
                //flag_c = true;
            }else {
                exobj.checkmenu(confirm);
            }
        }catch(InputMismatchException e){
           throw new InputMismatchException();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
