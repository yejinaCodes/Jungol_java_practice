package n4_자가진단_선택제어문;
import java.io.*;
import java.util.*;

public class nu_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());

        int equation = weight + 100 - height;
        System.out.println(equation);
        if (equation>0){
            System.out.println("Obesity");
        }
    }
}
