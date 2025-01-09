package CoreJava;

public class OuterClass {
    private static int staticOuterField = 10;

    static  class StaticNestedClass{
        void display(){
            System.out.println("staticOuterField value: "+ staticOuterField);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.display();
    }
}
