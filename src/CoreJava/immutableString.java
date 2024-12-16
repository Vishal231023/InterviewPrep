package CoreJava;

public class immutableString {
    public static void main(String[] args) {
        String str1 = "Vishal";
        String str2 = "Vishal";

        String str3 = str1 + "Saxena";

        str1 = str1.toUpperCase();

        System.out.println("str1: " + str1); // Output: "Vishal"
        System.out.println("str2: " + str2); // Output: "Vishal"
        System.out.println("str3: " + str3); // Output: "VishalSaxena"

        System.out.println(str1==str2);//Output: "False"

        String str4 = "Hello";
        String str5 = "Hello";
        String str6 = new String("Hello").intern();

        System.out.println(str4==str6);// Output "True"
        System.out.println(str4==str5);// Output "True"
        System.out.println(str6==str5);// Output "True"

        String str7 = new String("Hello");

        System.out.println(str7==str5);// Output "false"

        final String str8 = "Vishal Saxena";

        //str8 = "Saxena Vishal";//final variable value cannot be changed, once initialized







    }

}
