package n4_자가진단_선택제어문;
import java.io.*;
import java.util.*;
public class nu_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int age = Integer.parseInt(st.nextToken());
        if (age>=20){
            System.out.println("adult");
        }
        else{
            int tmp = 20 - age;
            System.out.printf("%d years later", tmp);
        }
    }
}
