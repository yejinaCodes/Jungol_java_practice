package MorningTest;

public class Q18 {

  public static void main(String[] args) {
    ShopService obj1 = ShopService.getInstance();
    ShopService obj2 = ShopService.getInstance();

    if(obj1 == obj2){
      System.out.println("동일 매장입니다.");
    }else{
      System.out.println("다른 매장입니다.");
    }
  }
}


