package pack;

public class Main {
    public static void main(String[] args) {

        try{
            func(5);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Код после блока try catch");

    }

    public static void func(int a){

        try{
            func(a);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}















