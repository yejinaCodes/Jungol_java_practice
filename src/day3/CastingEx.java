package day3;

import java.util.zip.CheckedOutputStream;

public class CastingEx {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(byteValue + " " + intValue);

        char charValue = 'A';
        int intValue1 = charValue;
        char charValue2 = (char)intValue1;
        System.out.println(intValue1);
        System.out.println(charValue2);

        int v1 = 10302997;
        byte bv1 = (byte)v1;
        System.out.println(v1 + " " + bv1);

        long longValue = 300;
        int intValue2 = (int)longValue;
        System.out.println(intValue2);

        byte result = 10 + 20;

        byte x = 10;
        byte y = 20;
        //byte result = x + y;
        int result3 = (int)x + (int)y;

        //실수: float(4), double(8)
        double result4 = 1.2f + 3.6;

        int intValue3 = 10;
        double doubleValue3 = 5.5;
        double result5 = intValue3 + doubleValue3;
        System.out.println(result5);
        int result6 = intValue3 + (int)doubleValue3;
        System.out.println(result6);


        int a = 1;
        int b = 2;
        double result7 = (double)a/b;
        double result8 = (double)a/(double)b;
        double result9 = (double)a/b;
        System.out.println(result7 + " " + result8 + " " + result9);

        int op1 = 3+7;
        String op2 = "3" + 7;
        String op3 = "3" + "7";

        int op4 = 1+2+3;
        String op5 = 1+2+"3";
        String op6 = 1+"2"+3;
        String op7 = "1"+(2+3);
        System.out.println(op5 + " " + op6 + " " + op7);

        //String type 변환
        int op8 = Integer.parseInt("10");
        System.out.println(op8+10);
        double op9 = Double.parseDouble("11.9");
        System.out.println(op9 + 0.1);
        boolean op10 = Boolean.parseBoolean("true");
        System.out.println(op10);

        //기본 타입으로 바꾼 다시 String 타입으로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(op9);
        String str3 = String.valueOf(op10);
        System.out.println(str1 + " " + str2 + " " + str3);

        //변수의 유효범위(Variable Scope):해당 변수가 접근 가능한 범위를 의미
        int aa = 10;
        if(aa == 10){
            int bb = 20;
            System.out.println("a = " + aa + " b =" + bb);
        }
        System.out.println(aa);

        //메소드의 내부
        int resultt = calculator(100,200);
        System.out.println(resultt);

    }

    public static int calculator(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("result: " + result);
        return result;

    }
}
