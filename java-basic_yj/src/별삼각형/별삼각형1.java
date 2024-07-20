package 별삼각형;
public class 별삼각형1 {
    public static void main(String[] args) {
        //공백, 별 찍기
        //table이라고 생각하면 됨.

        //type1
        System.out.println("종류 1");
        int star = 1;
        int empty;

        while(star < 6){
            for(int i = 0; i< star; i++){
                System.out.print("*");
            }
            star += 1;
            System.out.println();
        }

        //type2
        System.out.println("종류 2");
        star = 5;
        while(star > 0){
            for(int i = 0; i < star; i++){
                System.out.print("*");
            }
            star -= 1;
            System.out.println();
        }


        //type3
        System.out.println("종류 3");
        star = 9;
        empty = 0;
        while(star>0){
            for(int i=0;i<5;i++){
                for(int j=0; j<empty; j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                System.out.println();
                star -= 2;
                empty += 1;
            }
        }
        star = 1;
        empty = 4;
        while(empty>0){
            for(int i=0;i<5;i++){
                //space
                for(int j=0;j<empty;j++){
                    System.out.print(" ");
                }
                //star
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                System.out.println();
                empty -= 1;
                star += 2;
            }
        }
    }
}

