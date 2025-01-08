package CoreJava.OOPS;

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        System.out.println(staticPolymorphism.add(2,3));

        System.out.println(staticPolymorphism.add(2.5,3));
        System.out.println(staticPolymorphism.add(2,3,4));

    }

    public int add(int a , int b){
        return a+b;
    }
    public double add(double a , double b){
        return a+b;
    }
    public int add(int a , int b,int c){
        return a+b+c;
    }
}


