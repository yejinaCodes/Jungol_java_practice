package n3_자가진단_디버깅.PersonalDiagnosis_debugging_hyungpy;
import java.io.*;
import java.util.*;

public class nu_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        int sum = (int)a+(int)b+(int)c;
        int avg = (int)(a+b+c)/3;
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);

    }

}
