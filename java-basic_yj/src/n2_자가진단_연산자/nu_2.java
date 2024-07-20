package n2_자가진단_연산자;
import java.util.Scanner;
public class nu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        a = a + 100;
        b = b%10;
        System.out.printf("%d %d",a,b);
    }
}
