package n5_자가진단_반복제어문1.PersonalDiagnosis_for_hyungpy;
import java.io.*;
import java.util.StringTokenizer;

public class nu_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int even = 0;
        int odd = 0;
        while(true){
            int num = Integer.parseInt(st.nextToken());
            //int num = sc.nextInt();
            if (num == 0){
                break;
            }else if (num % 2 == 0){
                even += 1;
            }else if(num % 2 != 0){
                odd += 1;
            }
        }
        System.out.printf("odd : %d\n", odd);
        System.out.printf("even : %d\n", even);
    }
}
