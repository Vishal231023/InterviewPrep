package CoreJava.OOPS;

public class ConstructorTypes {
    String name;

    public ConstructorTypes(int a, int b){

    }

    public ConstructorTypes(ConstructorTypes obj){
        this.name = obj.name;
    }

    public static void main(String[] args) {
//        ConstructorTypes constructorTypes = new ConstructorTypes(); // default constructor
//        System.out.println(constructorTypes.val); // it returns Null value for obj refernce and string, and for int value it return 0

        //parameterized constructor
        ConstructorTypes c1 = new ConstructorTypes(1,2);
        c1.name = "Vishal";
        System.out.println(c1.name);

        //copy constructor, convinient way to clone the object
        //also it initializes the state of object with the xisting object
        ConstructorTypes c2 = new ConstructorTypes(c1);
        System.out.println(c2.name);
    }
}
