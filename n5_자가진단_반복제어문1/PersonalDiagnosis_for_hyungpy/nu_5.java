package n5_자가진단_반복제어문1.PersonalDiagnosis_for_hyungpy;
import java.io.*;
import java.util.StringTokenizer;

public class nu_5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean flag = true;
        while(flag){
            if(!flag){
                break;
            }
            st = new StringTokenizer(br.readLine());
            int base = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            double width = (((double)base)*((double)height))/2;

            System.out.printf("Base = %d\n", base);
            System.out.printf("Height = %d\n", height);
            System.out.printf("Triangle width = %.1f\n", width);
            System.out.printf("Continue ? ");

            char check = br.readLine().charAt(0);
            if(check == 'Y'|| check == 'y') {
                continue;
            }else{
                flag = false;
            }

        }
    }
}
