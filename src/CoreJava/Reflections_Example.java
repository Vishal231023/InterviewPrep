package CoreJava;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflections_Example {
    // we can get into inspect and manipulate the structure & behaviour of classes, interfaces
    // fields & methods at runtime.

    //usecases: Dependency injection that is used in spring
    // also used in Junits, and other testing tools
    // also in IDE's for auto code completion,
    // and in hibernate for mapping java objects into the database tables
    // also used by debugger to inspect objects and variables while program is running

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // instance is created of the COmpany class
        Company company = new Company("Quess");
        System.out.println("Company Name: "+ company.getName());

        // now we are  going to change the name of company from Quess
        // AirtelBank using reflection
        Field nameField = Company.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(company,"AirtelBank");
        System.out.println("Company Name After using Reflection:  "+ company.getName());

        // Invoke the private method dispalyName

        Method objMethod = Company.class.getDeclaredMethod("displayName");
        objMethod.setAccessible(true);
        objMethod.invoke(company);

    }

}

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    private void displayName(){
        System.out.println("private method invoked to display company name: "+ name);
    }
}
