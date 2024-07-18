package lambda.day03;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;

public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;

}
