package n2_자가진단_연산자;
import java.util.*;
public class nu_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();

        Boolean first = a>b;
        Boolean second = a<b;
        Boolean third = a>=b;
        Boolean fourth = a<=b;

        System.out.printf("%d > %d --- %b\n", a, b, first);
        System.out.printf("%d < %d --- %b\n", a, b, second);
        System.out.printf("%d >= %d --- %b\n", a, b, third);
        System.out.printf("%d <= %d --- %b\n", a, b, fourth);


    }
}
