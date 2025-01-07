package CoreJava.OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Maruti");
        car1.setPrice(100000);
        System.out.println("Car1's Price: " +  car1.getPrice());
        System.out.println("Car1's name: " +  car1.getName());

    }
}
class Car {
    private int price;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
