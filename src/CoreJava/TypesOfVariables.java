package CoreJava;

public class TypesOfVariables {
    public static void main(String[] args) {
        // Local Variable
        //Instance  variable - variables associated with object of classes, defined in class

        //Static variable - they don't need object, thry can be accesed by all objects of the class, they start with static keyword
        // static variables are initialized once the class is loaded in the memory
        // can be accesed using classs name and without crerating object

        // both instance and sttaic variable are created in heap memory


        Car obj = new Car();
        obj.val2 = 10;
        System.out.println(Car.val);
        System.out.println(obj.val2);
        display();

        Final_Static_StaticFinal_Variables Obj2 = new Final_Static_StaticFinal_Variables();
        Obj2.display();
        System.out.println(Final_Static_StaticFinal_Variables.PI);

    }

    public static  void display(){

        int a = 10;// local variable, are created in stack memory

        System.out.println(a);
    }

}
