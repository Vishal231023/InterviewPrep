package CoreJava;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        int num = 10;

        // when we assign value of primitive to wrapper class
        Integer number = num; // this is autoboxing

        Integer num2 = 100;

        int num3 = num2; // example of auto-unboxing

        //another example of same
        String str = "123";

        int number1 = Integer.parseInt(str);
        System.out.println(number1);







    }
}
