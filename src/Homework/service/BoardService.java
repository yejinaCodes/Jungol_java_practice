package Homework.service;

import Homework.BoardExample;
import Homework.dao.QueryMethods;
import Homework.exception.Exception_class;
import Homework.vo.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class BoardService {
    static int number = 1;
    static String title;
    static String content;
    static String writer;
    static String date;

    public static ArrayList<Board> boardlist = new ArrayList<Board>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //create
    public static void create(Connection connection) throws IOException {
        Exception_class exobj = new Exception_class();
        Boolean flag_c = false;

        Board tmp_board = new Board();
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
        //date = String.valueOf(LocalDate.now());

        tmp_board.setBtitle(title);
        tmp_board.setBwriter(writer);
        tmp_board.setBcontent(content);
        tmp_board.setBdate();


        //보조 메뉴 선택
        while(!flag_c){
            try{
                System.out.println("----------------------------------------------------");
                System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
                System.out.print("메뉴 선택: ");
                QueryMethods qm = new QueryMethods();
                flag_c = qm.insertDB(connection, tmp_board);
                //flag_c = true;
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }

    //read
    public static void read(Connection connection) throws IOException {

        Board reading_board = null;
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");

        QueryMethods qm = new QueryMethods();
        int bno = Integer.parseInt(br.readLine());

        Boolean board_exist = qm.readOneBoard(connection, bno);
        if(board_exist){

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
                    BoardService.list();
                    break;
            }
        }
        else{
            System.err.println("해당 board 는 존재하지 않습니다.");
        }

    }

    //list
    public static void list(Connection connection){
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------");
        System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");

        boardlist.clear();
        QueryMethods qm = new QueryMethods();
        try{
            boardlist = qm.getDB(connection);
            for(Board board: boardlist){
                System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
            }
            System.out.println("----------------------------------------------------");

        }catch(RuntimeException e){
            System.err.println("DB 목록을 가지고 올 수 없습니다.");
        }


    }
//
//    //update
//    public static void update(Board current_board) throws IOException {
//        System.out.println("[수정 내용 입력]");
//        System.out.print("제목: ");
//        String tmp_title = br.readLine();
//        System.out.print("내용: ");
//        String tmp_content = br.readLine();
//        System.out.print("작성자: ");
//        String tmp_writer = br.readLine();
//
//        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
//        System.out.print("메뉴 선택: ");
//        int confirm = Integer.parseInt(br.readLine());
//        if(confirm == 1){
//            current_board.setBtitle(tmp_title);
//            current_board.setBcontent(tmp_content);
//            current_board.setBwriter(tmp_writer);
//        }
//    }
//
//
//    //clear
//    public static void clear(Connection connection) throws IOException {
//        System.out.println("[게시물 전체 삭제]");
//        System.out.println("----------------------------------------------------");
//        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
//        System.out.print("메뉴 선택: ");
//
//        int side_menu = Integer.parseInt(br.readLine());
//        if(side_menu == 1){
//            boardlist.clear();
//        }
//    }
//
//
//    //delete
//    public static void delete(Board current_board){
//        boardlist.remove(current_board);
//    }

    //mainMenu
    public static void mainMenu(){
        System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴선택: ");
    }

}
