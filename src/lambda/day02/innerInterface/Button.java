package lambda.day02.innerInterface;

public class Button {
    public static interface ClickListener{
        void onClick();
    }
    //setter 메서드를 이용하여 clickListener 구현 객체를 injectino
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }

}
