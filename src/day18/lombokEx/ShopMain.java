package day18.lombokEx;

public class ShopMain {

  public static void main(String[] args) {
    StoreDTO shop = new StoreDTO();
    System.out.println(shop.toString());
    StoreDTO shop1 = new StoreDTO("emart-강남", "e-001", "02-444-8888", "emart-001", "서울시 노원구");
    StoreDTO shop2 = new StoreDTO("emart-강남", "e-001", "02-444-8888", "emart-001", "서울시 노원구");

    System.out.println(shop1.toString());
    System.out.println(shop1);

    if(shop1.equals(shop2)){
      System.out.println("같은 가게");
    }else{
      System.out.println("다른 가게");
    }

    StoreDTO shop4 = StoreDTO.builder().shopName("emart-청담점").shopTele("02-4444-3242").build();
    System.out.println(shop4);
  }

}
