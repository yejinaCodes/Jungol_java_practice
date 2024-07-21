package Homework;
import Homework.exception.BoardException;
import Homework.service.BoardService;
import Homework.service.BoardServiceImpl;
import Homework.vo.Board;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BoardExample {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String title;
    public static String content;
    public static String writer;

    public static void main(String[] args) throws IOException, SQLException {

        BoardService bs = new BoardServiceImpl();
        while (true){
            try{
                System.out.println("[게시물 목록]");
                System.out.println("----------------------------------------------------");
                System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");
                ArrayList<Board> bl = bs.list();

                for(Board board: bl){
                    System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
                }
                System.out.println("----------------------------------------------------");
                System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
                System.out.print("메뉴선택: ");

                int menu = br.read();
                System.out.println();
                //int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    //create
                    case 1:
                        BoardException exptobj = new BoardException();
                        Board tmp_board = new Board();

                        //새 게시물 입력 부분
                        while(true){
                            try {
                                System.out.println("[새 게시물 입력]");
                                System.out.print("제목: ");
                                title = br.readLine();
                                exptobj.checktitle(title);
                                break;
                            } catch (InputMismatchException | IOException e) {
                                System.err.println(e.getMessage());
                            }
                        }

                        System.out.print("내용: ");
                        content = br.readLine();

                        while(true){
                            try{
                                System.out.print("작성자: ");
                                writer = br.readLine();
                                exptobj.checkAuthor(writer);
                                break;
                            }catch (InputMismatchException e){
                                System.err.println(e.getMessage());
                                System.out.println();
                            }
                        }

                        //입력 값을 tmp_board로 가지고 있기
                        tmp_board.setBtitle(title);
                        tmp_board.setBwriter(writer);
                        tmp_board.setBcontent(content);
                        tmp_board.setBdate();

                        //보조 메뉴 선택
                        while(true){
                            try{
                                System.out.println("----------------------------------------------------");
                                System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                                System.out.print("메뉴 선택: ");
                                int confirm = br.read();
                                //exptobj.checkmenu(confirm);
                                bs.create(tmp_board);
                                break;
                            }catch(InputMismatchException e){
                                System.err.println(e.getMessage());
                            }
                        }
                        break;

                    //read
                    case 2:
                        //exception 처리 추가해주기
                        while(true){
                            try{
                                System.out.println("[게시물 읽기]");
                                System.out.print("bno: ");
                                int bno = br.read();
                                Board board = bs.read(bno);

                                //게시물 출력하기
                                System.out.println("################");
                                System.out.println("번호 : " + bno);
                                System.out.println("제목: " + board.getBtitle());
                                System.out.println("내용: " + board.getBcontent());
                                System.out.println("작성자: " + board.getBwriter());
                                System.out.println("날짜: " + board.getBdate());
                                System.out.println("----------------------------------------------------");

                                System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
                                System.out.print("메뉴 선택: ");

                                int side_menu = br.read();
                                switch (side_menu){
                                    //update
                                    case 1:
                                        System.out.println("[수정 내용 입력]");
                                        System.out.print("제목: ");
                                        String tmp_title = br.readLine();
                                        System.out.print("내용: ");
                                        String tmp_content = br.readLine();
                                        System.out.print("작성자: ");
                                        String tmp_writer = br.readLine();

                                        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                                        System.out.print("메뉴 선택: ");

                                        int confirm = br.read();

                                        if(confirm == 1){
                                            Board new_board = new Board();
                                            new_board.setBtitle(tmp_title);
                                            new_board.setBcontent(tmp_content);
                                            new_board.setBwriter(tmp_writer);
                                            new_board.setBdate();

                                            bs.update(new_board);
                                        }
                                        break;
                                    //delete
                                    case 2:
                                        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                                        System.out.print("메뉴 선택: ");

                                        confirm = br.read();
                                        if(confirm == 1){
                                            bs.delete(bno);
                                        }
                                        break;
                                    //list
                                    case 3:
                                        bs.list();
                                        break;
                                }
                                break;
                            }catch (SQLException e){
                                System.err.println("해당 게시물은 존재하지 않습니다.");
                            }
                        }
                        break;

                    //전체 삭제
                    case 3:
                        System.out.println("[게시물 전체 삭제]");
                        System.out.println("----------------------------------------------------");
                        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                        System.out.print("메뉴 선택: ");

                        int side_menu = br.read();
                        if(side_menu == 1){
                            bs.clear();
                        }
                        break;
                    //exit
                    case 4:
                        System.out.println("** 게시판 종료 ** ");
                        break;
                }
            }catch(IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
