package CoreJava;

public class EqualsMethodDifference {
    public static void main(String[] args) {

        String s1  = new String("Vishal");
        String s2 = new String("Vishal");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Bus b1 = new Bus();
        Bus b2 = new Bus();

        System.out.println(b1.equals(b2));

    }
}
class Bus {
    int value;
}
