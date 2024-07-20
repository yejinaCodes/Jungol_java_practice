package n5_자가진단_반복제어문1.PersonalDiagnosis_for_hyungpy;
import java.io.*;
import java.util.StringTokenizer;

public class nu_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        double avg = 0;
        int n = 0;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            if(num > 100){
                break;
            }else {
                sum += num;
                n += 1;
            }
        }
        avg = ((double)sum)/((double)n);
        System.out.printf("sum : %d\n", sum);
        System.out.printf("sum : %.1f", avg);
    }
}
