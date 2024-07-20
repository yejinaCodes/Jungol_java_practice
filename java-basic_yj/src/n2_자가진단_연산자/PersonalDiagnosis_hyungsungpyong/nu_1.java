package n2_자가진단_연산자.PersonalDiagnosis_hyungsungpyong;
import java.util.*;
import java.io.*;
public class nu_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int summation = a+b+c+d;
        int average = (a+b+c+d)/4;

        System.out.printf("sum %d%n", summation);
        System.out.printf("avg %d", average);






    }



}
