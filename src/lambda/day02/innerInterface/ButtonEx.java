package lambda.day02.innerInterface;

public class ButtonEx {
    public static void main(String[] args) {
        Button okbtn = new Button();

        class okListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("ok버튼 클릭!");
            }
        }

        okbtn.setClickListener(new okListener());
        okbtn.click();

        //cancel버튼 생성
        Button cancelbtn = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("cancel 버튼 클릭!");
            }
        }
        //cancel버튼 클릭 이벤트를 처리할 clicklistener을 구현
        cancelbtn.setClickListener(new CancelListener());
        cancelbtn.click();

        //구현 클래스 setting


        //cancel 버튼 클릭하기


    }
}
