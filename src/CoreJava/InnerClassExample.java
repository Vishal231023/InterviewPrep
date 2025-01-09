package CoreJava;

public class InnerClassExample {

    private int outerField = 10;
    class InnerClass{
       void display(){
           System.out.println("Outerfiled Value: " + outerField);
       }

    }

    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();

        InnerClassExample.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
