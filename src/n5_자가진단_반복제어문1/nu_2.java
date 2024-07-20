package n5_자가진단_반복제어문1;
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
