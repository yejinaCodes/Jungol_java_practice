package n5_PersonalDiagnosis_for;
import java.util.Scanner;
public class nu_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg = 0;
        int n = 0;
        while(true){
            int input = sc.nextInt();
            n += 1;
            if (input >= 100){
                total += input;
                break;
            }else{
                total += input;
            }
        }
        avg = ((double)total/(double)n);
        System.out.println(total);
        System.out.println(n);
        System.out.printf("%.1f", avg);
    }
}
