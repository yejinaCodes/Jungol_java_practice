package n5_PersonalDiagnosis_for;
import java.util.Scanner;
public class nu_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("number? ");
            int input = sc.nextInt();
            if(input == 0){
                break;
            }else if (input > 0){
                System.out.println("positive integer");
            }else if (input < 0){
                System.out.println("negative number");
            }
        }


    }

}
