package n3_자가진단_디버깅;
import java.io.*;
import java.util.*;
public class nu_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = (int)a/b;
        double d = (double)a/(double)b;
        //System.out.printf("%d %.2d",c,d);
        //System.out.printf((String.format("%d %.2f",c,d)));
        System.out.printf("%d %.2f",c,d);
    }
}
