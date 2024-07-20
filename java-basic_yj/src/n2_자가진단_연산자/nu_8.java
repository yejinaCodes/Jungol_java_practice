package n2_자가진단_연산자;
import java.util.*;
public class nu_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = 0;
        int result2 = 0;

        if (a > b && a > c){
            result1 = 1;
        }
        else{
            result1 = 0;
        }

        if (a==b && b ==c){
            result2 = 1;
        }
        else{
            result2 = 0;
        }
        System.out.printf("%d %d", result1, result2);
    }
}
