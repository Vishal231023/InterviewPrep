package CoreJava.OOPS;

public class ConcreteClass extends AbstractClass {
    @Override
    void shape() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        ConcreteClass c1 =  new ConcreteClass();
        c1.shape();
        c1.name();
    }
}
