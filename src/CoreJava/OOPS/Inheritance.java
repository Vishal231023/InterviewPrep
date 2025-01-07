package CoreJava.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eatFood();
        dog.makeSound();


        // when we are creating an object of subclass with refernce
        // to its parent class , it is called upcasting

        Animal animal = new Dog(); // it is upcasting
        animal.makeSound();

        //when you downcas the object back to its subclass refernce, then it is called doencasting
        Dog dog1 = (Dog) animal; // this is downcasting
        dog1.makeSound();
        dog1.eatFood();
        // if you try to  downcast the object to its type that doesnt belong to
        // then it throws ClassCastException
        //example of classcastexception below

        Animal animal1 = new Animal();
        Dog dog2 = (Dog) animal1;







    }
}

    class Animal{
        public void makeSound(){
            System.out.println("Animal's make Sound");
        }
    }

    class Dog extends Animal{

        @Override
        public void makeSound() {
            System.out.println("Dog's do barking");
        }
        public void eatFood(){
            System.out.println("Dog eats food");
        }
    }

