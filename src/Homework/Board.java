package Homework;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Board {
    private int bno;
    private String bwriter;
    private LocalDate bdate;
    private String btitle;
    private String bcontent;

    public void setBdate() {
        this.bdate = LocalDate.now();
    }
}
