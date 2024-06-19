package n4_자가진단_선택제어문;
import java.io.*;
import java.util.*;

public class nu_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        double weight = Double.parseDouble(st.nextToken());
        String type = "";
        if (weight < 50.80) {
            type = "Flyweight";
        } else if (weight < 61.23) {
            type = "Lightweight";
        } else if (weight < 72.57) {
            type = "Middleweight";
        } else if (weight < 88.45) {
            type = "Cruiserweight";
        } else {
            type = "Heavyweight";
        }
        System.out.println(type);
    }
}
