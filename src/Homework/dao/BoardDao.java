package Homework.dao;

import Homework.vo.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
    ArrayList<Board> boardlist = new ArrayList<Board>();
    private static ResultSet rs = null;

    public void insertDB(Board board) throws SQLException {
        Connection connection = new DBConnection().open();
        String query = new StringBuilder()
            .append("INSERT INTO board (writer, date, title, content) ")
            .append("VALUES(?,?,?,?)")
            .toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, board.getBwriter());
            pstmt.setString(2, board.getBdate());
            pstmt.setString(3, board.getBtitle());
            pstmt.setString(4, board.getBcontent());

            //rs = pstmt.executeQuery();

            pstmt.executeUpdate();
            pstmt.close();
            //rs.close();
            connection.close();
            return;
        }catch(Exception e) {
            System.out.println("DB 게시글 생성중 오류 발생");
        }
        connection.close();
    }

    public ArrayList<Board> getDB(){
        Connection connection = new DBConnection().open();
        String query = "SELECT * FROM board";
        boardlist.clear();
        try{
            PreparedStatement pstmt = connection.prepareStatement(query);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("no"));
                board.setBwriter(rs.getString("writer"));
                board.setBdate(rs.getString("date"));
                board.setBtitle(rs.getString("title"));
                boardlist.add(board);
            }
                //stream 적용해보기
                //A table of data representing a database result set, which is usually generated by executing a statement that queries the database.

            connection.close();
            rs.close();
            pstmt.close();
            return boardlist;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Board readOneBoard(int bno) throws SQLException {
        Connection connection = new DBConnection().open();
        Board tmp_board = new Board();
        String query = "Select * FROM board WHERE no=?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, String.valueOf(bno));
            rs = pstmt.executeQuery(); //executeQuery문으로 query문을 실행해 resultset을 얻음.

            if(rs.next()){
                tmp_board.setBno(rs.getInt("no"));
                tmp_board.setBwriter(rs.getString("writer"));
                tmp_board.setBtitle(rs.getString("title"));
                tmp_board.setBdate(rs.getString("date"));
                tmp_board.setBcontent(rs.getString("content"));

                connection.close();
                rs.close();
                pstmt.close();
                return tmp_board;
            }else{
                return null; //다른방법?
            }
        }catch (Exception e){
            System.err.println("DB에 해당 게시물이 존재하지 않습니다.");
        }
        connection.close();
        return null;
    }


    public void updateOneBoard(Board board) throws SQLException {
        Connection connection = new DBConnection().open();

        String query = new StringBuilder()
            .append("UPDATE board SET ")
            .append("writer=?, ")
            .append("date=?, ")
            .append("title=?, ")
            .append("content=? ")
            .append("WHERE no=?")
            .toString();

        try{
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, board.getBwriter());
            pstmt.setString(2, board.getBdate());
            pstmt.setString(3, board.getBtitle());
            pstmt.setString(4, board.getBcontent());
            pstmt.setString(5, String.valueOf(board.getBno()));

            pstmt.executeUpdate();

            connection.close();
            rs.close();
            pstmt.close();

        }catch(Exception e){
            System.err.println("DB board 업데이트 문제가 발생했습니다.");
        }
        connection.close();
    }


    public void delete(int bno) throws SQLException {
        Connection connection = new DBConnection().open();
        String query = "DELETE FROM board WHERE no=?";

        try{
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, String.valueOf(bno));
            pstmt.executeUpdate(); //executeQuery()쓰면 안됨

            pstmt.close();
            connection.close();
        }catch (Exception e){
            System.err.println("DB delete 에러 발생했습니다.");
        }
        connection.close();
    }

    public void clear(){
        Connection connection = new DBConnection().open();
        String query = "TRUNCATE TABLE board ";

        try{
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.executeUpdate();

            //rs.close();
            pstmt.close();
            connection.close();
        }catch (Exception e){
            System.err.println("DB clear 에러 발생했습니다.");
        }
    }
}