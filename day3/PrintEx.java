package day3;

public class PrintEx {
    public static void main(String[] args) {
        //prinf: 줄바꿈 없음. %n \n사용가능

        //result = [     10]
        long l1 = 10;
        System.out.printf("result = [%5d]%n", l1);
        System.out.printf("result = [%-5d]%n", l1);
        System.out.printf("result = [%05d]%n", l1);

        long hx = 0xFFFF; //15 15 15 15들어감 0x는 16진수를 뜻함.
        System.out.printf("hx = %x%n", hx);
        System.out.printf("hx = %#x%n", hx);
        System.out.printf("hx = %X%n", hx);

        //10진수를 2진수로 출력하는 지시자는 없다. Integer.toBinaryString(int i) 사용
        int binaryNum = 0b10;
        System.out.printf("binaryNum = %s%n", Integer.toBinaryString(binaryNum));

        char c = 'A';
        System.out.printf("c = %c, %d %n", c, (int)c);




    }
}
