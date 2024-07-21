package Homework.vo;

import java.time.format.DateTimeFormatter;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Board {
    private int bno;
    private String bwriter;
    private String bdate;
    private String btitle;
    private String bcontent;

    public void setBdate() {
        this.bdate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYYMMdd"));
    }
}
