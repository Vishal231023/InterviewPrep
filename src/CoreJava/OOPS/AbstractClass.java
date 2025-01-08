package CoreJava.OOPS;

abstract class AbstractClass {

    //they can have both abstract, non abstract methods, constructors,variables and instances
    //abstract classes are used to define common behavior, and so other subclasses can extends that class and use bthr common behaviour
    // it serves as a blueprint for ther concrete classes
    abstract void shape();

    void name(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        AbstractClass c1 = new AbstractClass() {
            @Override
            void shape() {
                System.out.println("i am abstract class ");
            }
        };
        c1.name();
        c1.shape();
    }
}
