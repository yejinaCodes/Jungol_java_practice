package PersonalDiagnosis_yonsanja;
import java.io.*;
import java.util.*;
public class nu_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        a = a++;
        b = --b;
        System.out.printf("%d %d %d", a, b, a*b);
    }
}
