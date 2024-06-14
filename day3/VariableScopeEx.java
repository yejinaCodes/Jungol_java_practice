package day3;

public class VariableScopeEx {
    static int globalValue = 100; //class변수. 전역변수라고 생각하면됨.
    public static void main(String[] args) {
        System.out.println("globalValue: " + globalValue);
        VariableScopeEx instance = new VariableScopeEx(); //instance만들어서 method접근
        instance.accessInstance();//instance method 지역변수 접근
        modifyGlobalValue(); //static이기 떄문에 직접 호출

        //이렇게도 사용했었음.
        {
            int anmos = 500;
            System.out.println("anmos: " + anmos);

        }
    }
    //method
    public void accessInstance(){
        int localVariable = 200;
        System.out.println("localvariable = " + localVariable + globalValue);
    }
    public static void modifyGlobalValue(){
        globalValue = 200;
        System.out.println("globalValue = " + globalValue);
    }

}
