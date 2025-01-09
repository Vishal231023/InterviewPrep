package CoreJava;

public final class Immutable {

    private  final int age ;
    private final String name;

    public Immutable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable(31,"Vishal");
        System.out.println(immutable.age);


    }
}
