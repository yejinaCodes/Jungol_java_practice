package n4_자가진단_선택제어문;
import java.io.*;
import java.util.*;

public class nu_6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        String gender = st.nextToken(); //어차피 readline은 string으로 받아오기 때문 Parse필요없음
        int age = Integer.parseInt(st.nextToken());
        if(gender.equals('F')){
            System.out.println("GIRL");
        }else{
            System.out.println("BOY");
        }
    }
}
