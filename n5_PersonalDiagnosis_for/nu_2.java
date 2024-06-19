package n5_PersonalDiagnosis_for;
import java.util.Scanner;
public class nu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tmp = 1;
        int total = 0;
        while(true){
            total += tmp;
            tmp++;
            if(tmp > input){
                break;
            }
        }
        System.out.println(total);
    }
}
