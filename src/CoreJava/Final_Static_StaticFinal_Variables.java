package CoreJava;

public class Final_Static_StaticFinal_Variables {
    final int age = 100;

    static int num ;
    static  final double PI = 3.14; // final static value, must be initialized once, and connot re assigned value
    //it is like a constants




    public void  getAge(){
       // age = 101;// giving compilation error, as final variable cannot be re assigned the value
        System.out.println(age);
    }

    public Final_Static_StaticFinal_Variables(){
        num++;
    }

    public void display(){
        System.out.println(num);
    }
}
