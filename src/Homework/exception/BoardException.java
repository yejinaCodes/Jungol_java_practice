package Homework.exception;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class BoardException extends Exception{

    public void checktitle(String title) throws InputMismatchException{
        boolean check = Pattern.matches("^[a-zA-Z]*$", title);
        if(!check)  throw new InputMismatchException("영문 제목을 입력하시오");
    }
    public void checkAuthor(String writer) throws InputMismatchException{
        boolean check = Pattern.matches("^[a-zA-Z]*$",writer);
        if(!check)  throw new InputMismatchException("영문 작성자를 작성하시오.");
    }
    public void checkmenu(int num) throws InputMismatchException{
        if(num != 1 && num!= 2) throw new InputMismatchException("메뉴 1 혹은 2를 선택하시오.");
    }
}
