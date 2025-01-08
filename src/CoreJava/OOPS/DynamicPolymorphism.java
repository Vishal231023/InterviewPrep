package CoreJava.OOPS;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.getName();


    }
}

    class A{
       String name;

        public String getName(){
            System.out.println("Hello");
            return "hello";
        }
    }
    class B extends A{
        @Override
        public String getName() {
            System.out.println("Vishal Saxena");
            return "Vishal Saxena";
        }
    }

