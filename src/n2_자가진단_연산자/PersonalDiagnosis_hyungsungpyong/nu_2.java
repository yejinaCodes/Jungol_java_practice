package n2_자가진단_연산자.PersonalDiagnosis_hyungsungpyong;
import java.io.*;
import java.util.*;

public class nu_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d / %d = %d...%d", a, b, a/b, a%b);




    }
}
