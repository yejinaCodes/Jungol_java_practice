package n5_자가진단_반복제어문1;
import java.util.Scanner;
public class nu_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf(
                    """
                    1. Korea
                    2. USA
                    3. Japan
                    4. China
                    """
            );
            Boolean flag = false;
            System.out.printf("number? ");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");
                    flag = true;
                    break;
            }if(flag == true){
                break;
            }
        }
    }
}
