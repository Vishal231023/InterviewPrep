package CoreJava.OOPS;

public class ExampleClass implements InterfaceExample{
    @Override
    public void getName() {
        System.out.println("Vishal Saxema");
    }

    @Override
    public int getAge() {
        return 31;
    }

    public static void main(String[] args) {
        ExampleClass c1 = new ExampleClass();
        System.out.println(c1.getAge());
        c1.getName();
    }
}
