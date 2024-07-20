package n2_자가진단_연산자.PersonalDiagnosis_hyungsungpyong;
import java.io.*;
import java.util.*;
public class nu_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a = a+5;
        b = b*2;
        System.out.printf("width = %d%n", a);
        System.out.printf("length = %d%n", b);
        System.out.printf("area = %d%n", a*b);


    }
}
