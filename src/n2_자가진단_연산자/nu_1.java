package n2_자가진단_연산자;
import java.util.Scanner;

public class nu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        System.out.printf("sum : %d\n", a+b+c);
        System.out.printf("avg : %d", (a+b+c)/3);
    }
}
