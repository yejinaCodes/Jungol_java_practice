package n4_자가진단_선택제어문;
import java.io.*;
import java.util.*;

public class nu_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        System.out.println(a);
        if (a<0){
            System.out.println("minus");
        }

    }
}
