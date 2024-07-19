package Homework.service;

import Homework.exception.Exception_class;
import Homework.vo.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class BoardService {
    static int number = 1;
    static String title;
    static String content;
    static String writer;
    static String date;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

    //create
    public static void create() throws IOException {
        Exception_class exobj = new Exception_class();
        Boolean flag_c = false;

        //새 게시물 입력 부분
        while(!flag_c) {
            try {
                System.out.println("[새 게시물 입력]");
                System.out.print("제목: ");
                title = br.readLine();
                exobj.checktitle(title); //elaborate
                flag_c = true;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.print("내용: ");
        content = br.readLine();

        while(flag_c){
            try{
                System.out.print("작성자: ");
                writer = br.readLine();
                exobj.checkAuthor(writer);
                flag_c = false;
            }catch (InputMismatchException e){
                System.err.println(e.getMessage());
                System.out.println();
            }
        }
        date = String.valueOf(LocalDate.now());


        //보조 메뉴 선택
        while(!flag_c){
            String query = "INSERT INTO board_site(writer, date, title, content)" + "VALUES(?,?,?,?)";
            System.out.println("----------------------------------------------------");
            System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
            System.out.print("메뉴 선택: ");

            int confirm = Integer.parseInt(br.readLine());
            try{
                if(confirm == 1){
                    //db에 저장하기
                    PreparedStatement pstmt = connection.prepareStatement(query);
                    //pstmt.setString(1, String.valueOf(number));
                    pstmt.setString(1, writer);
                    pstmt.setString(2, date);
                    pstmt.setString(3, title);
                    pstmt.setString(4, content);

                    int rows = pstmt.executeUpdate();
                    pstmt.close();

                    number++;
                    flag_c = true;
                } else if (confirm == 2) {
                    System.out.println();
                    flag_c = true;
                }else {
                    exobj.checkmenu(confirm);
                }
            }catch(InputMismatchException e){
                System.err.println(e.getMessage());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //read
    public static void read() throws IOException {

        Board reading_board = null;
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(br.readLine());

        //String builder
        String query = "Select * " + "FROM board_site " + "WHERE no=?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, String.valueOf(bno));

            rs= pstmt.executeQuery();

            if(rs.next()){
                //Board board = new Board();
                reading_board.setBno(rs.getByte("no"));
                reading_board.setBwriter(rs.getString("writer"));
                reading_board.setBtitle(rs.getString("title"));
                reading_board.setBdate(LocalDate.parse(rs.getString("date")));
            }else{
                System.out.println("해당 board 는 존재하지 않습니다.");
            }
            rs.close();
            pstmt.close();

            System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
            System.out.print("메뉴 선택: ");

            int side_menu = Integer.parseInt(br.readLine());
            switch (side_menu){
                case 1:
                    update(reading_board);
                    break;
                case 2:
                    delete(reading_board);
                    break;
                case 3:
                    list();
                    break;
            }
        }catch (Exception e){
            System.out.println("해당 게시물이 존재하지 않습니다.");
        }
    }

    //list
    public static void list(){
        String query = "SELECT * FROM board_site";

        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------");
        System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");
        boardlist.clear();

        try{
            PreparedStatement pstmt = connection.prepareStatement(query);
            rs = pstmt.executeQuery();
            //Executes the SQL query in this PreparedStatement object and returns the ResultSet object generated by the query.
            while(rs.next()){
                //A table of data representing a database result set, which is usually generated by executing a statement that queries the database.
                Board board = new Board();
                board.setBno(rs.getByte("no"));
                board.setBwriter(rs.getString("writer"));
                board.setBdate(LocalDate.parse(rs.getString("date")));
                board.setBtitle(rs.getString("title"));

                boardlist.add(board);
            }
            for(Board board: boardlist){
                System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
            }
            System.out.println("----------------------------------------------------");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //update
    public static void update(Board current_board) throws IOException {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String tmp_title = br.readLine();
        System.out.print("내용: ");
        String tmp_content = br.readLine();
        System.out.print("작성자: ");
        String tmp_writer = br.readLine();

        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int confirm = Integer.parseInt(br.readLine());
        if(confirm == 1){
            current_board.setBtitle(tmp_title);
            current_board.setBcontent(tmp_content);
            current_board.setBwriter(tmp_writer);
        }
    }


    //clear
    public static void clear() throws IOException {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("----------------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");

        int side_menu = Integer.parseInt(br.readLine());
        if(side_menu == 1){
            boardlist.clear();
        }
    }


    //delete
    public static void delete(Board current_board){
        boardlist.remove(current_board);
    }

    //mainMenu
    public static void mainMenu(){
        System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴선택: ");
    }

}
