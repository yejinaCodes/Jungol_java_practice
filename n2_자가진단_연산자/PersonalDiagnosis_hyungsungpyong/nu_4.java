package n2_자가진단_연산자.PersonalDiagnosis_hyungsungpyong;
import java.io.*;
import java.util.*;
public class nu_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(++a + " ");
        bw.write(b-- + "\n");
        bw.write(a + " ");
        bw.write(b + "");
        bw.flush();
        bw.close();


    }
}