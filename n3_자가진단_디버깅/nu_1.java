package n3_자가진단_디버깅;
import java.io.*;
import java.util.*;
public class nu_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        Integer c = (int)(a*b);
        Integer d = a.intValue() * b.intValue();
        //bw.write();
        System.out.printf("%d %d",c,d);
        //bw.flush();
        //bw.close();




    }
}
