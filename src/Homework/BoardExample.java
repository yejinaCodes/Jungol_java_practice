package Homework;

import java.io.*;
import java.util.ArrayList;

public class BoardExample {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int number = 1;

    static ArrayList<Board> boardlist = new ArrayList<>();

    static void list(){
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------");
        System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");
        if(boardlist.size() > 0){
            for(Board b: boardlist){
                System.out.println(b.getBno() + "\t\t" + b.getBwriter() + "\t\t\t" + b.getBdate() + "\t\t\t" + b.getBtitle());
            }
            System.out.println("----------------------------------------------------");
        }
    }
    static void mainMenu(){
        System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴선택: ");
    }

    static void create() throws IOException {
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        String title = br.readLine();
        System.out.print("내용: ");
        String content = br.readLine();
        System.out.print("작성자: ");
        String writer = br.readLine();
        System.out.println("----------------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int confirm = Integer.parseInt(br.readLine());
        if(confirm == 1){
            Board created = new Board();
            created.setBtitle(title);
            created.setBcontent(content);
            created.setBwriter(writer);
            created.setBdate();
            created.setBno(number);
            number++;
            boardlist.add(created);
        }
    }

    static void read() throws IOException {
        Board reading_board = null;
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(br.readLine());
        try {
            for(Board b: boardlist){
                if(b.getBno() == bno){
                    reading_board = b;
                    break;
                }
            }
            System.out.println("############");
            System.out.println("번호: " + reading_board.getBno());
            System.out.println("제목: " + reading_board.getBtitle());
            System.out.println("내용: " + reading_board.getBcontent());
            System.out.println("작성자: " + reading_board.getBwriter());
            System.out.println("날짜: " + reading_board.getBdate());

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

    static void update(Board current_board) throws IOException {
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

    static void delete(Board current_board){
        boardlist.remove(current_board);
    }
    static void clear() throws IOException {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("----------------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");

        int side_menu = Integer.parseInt(br.readLine());
        if(side_menu == 1){
            boardlist.clear();
        }
    }

    public static void main(String[] args) throws IOException {

        //BoardExample board = new BoardExample();
        Boolean flag = false;

        Board sample1 = new Board();
        sample1.setBno(number);
        number++;
        sample1.setBwriter("yejin");
        sample1.setBtitle("봄의 정원");
        sample1.setBdate();
        boardlist.add(sample1);

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
    }

}
