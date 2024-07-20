package n5_자가진단_반복제어문1.PersonalDiagnosis_for_hyungpy;
import java.io.*;
import java.util.StringTokenizer;

public class nu_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n=0;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            if(num==0){
                break;
            }else if(num%3==0 || num%5==0){
                continue;
            }else{
                n+=1;
            }
        }
        System.out.println(n);
    }
}
