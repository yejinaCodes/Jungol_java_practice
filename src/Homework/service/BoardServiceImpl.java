//service 구현체 만들기
package Homework.service;

import Homework.dao.BoardDao;
import Homework.vo.Board;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardServiceImpl implements BoardService{

  public static ArrayList<Board> boardlist = new ArrayList<>();

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  //create 구현
  @Override
  public void create(Board board) throws SQLException {
    BoardDao qm = new BoardDao();
    qm.insertDB(board);
  }

  //read 구현
  @Override
  public Board read(int bno) throws SQLException {
    BoardDao qm = new BoardDao();
    return qm.readOneBoard(bno);
  }

  //list 구현
  @Override
  public ArrayList<Board> list(){
    boardlist.clear();
    BoardDao qm = new BoardDao();
    try{
      boardlist = qm.getDB();
      return boardlist;
    }catch(RuntimeException e){
      System.err.println("DB 목록을 가지고 올 수 없습니다.");
    }
    return null;
  }

  //update
  @Override
  public void update(Board board) throws SQLException {
    BoardDao qm = new BoardDao();
    qm.updateOneBoard(board);
  }

  //delete
  @Override
  public void delete(int bno) throws SQLException {
    BoardDao qm = new BoardDao();
    qm.delete(bno);
  }

  //clear
  @Override
  public void clear(){
    BoardDao qm = new BoardDao();
    qm.clear();
  }
}

