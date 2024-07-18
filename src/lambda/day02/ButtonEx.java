package lambda.day02;

import org.w3c.dom.ls.LSOutput;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn = new Button();


        btn.setClickListener(
                () -> {
                    System.out.println("버튼이 클릭되었습니다.");
                }
        );
        btn.click();
        Button cancelbtn = new Button();
        cancelbtn.setClickListener(
                ()-> {
                    System.out.println("cancel되었습니다.");
                }
        );
        cancelbtn.click(); //그때그때마다 교체해서 쓸 수 있게 됨.

    }
}
