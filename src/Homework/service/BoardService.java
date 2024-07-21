//service interface만들기
package Homework.service;

import Homework.vo.Board;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface BoardService {

    void create(Board tmp_board) throws IOException, SQLException;

    Board read(int bno) throws SQLException, IOException;

    ArrayList<Board> list();

    void update(Board board) throws SQLException;

    void clear();

    void delete(int bno) throws SQLException;

}
