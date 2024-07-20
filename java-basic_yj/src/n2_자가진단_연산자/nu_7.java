package n2_자가진단_연산자;
import java.util.*;

public class nu_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(b);
        int result = a * b;
        int result2 = a + b;
        Boolean r= (result != 0);
        Boolean r2 = (result2 != 0);
        System.out.printf(r + " " + r2);
    }
}

//true = 1
//false = 0
