package n5_자가진단_반복제어문1;
import java.util.Scanner;
public class nu_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("(입력)");
            int input = sc.nextInt();
            if (input%3 == 0){
                System.out.printf("(출력)%d\n",input/3);
            }else if (input == -1){
                break;
            }
        }
    }
}
