import javax.naming.AuthenticationNotSupportedException;
import java.time.Period;

public class ClassesAndObjects2 {
    public static void  main(String[] args) {

        Person person1 = new Person();
        person1.setName("Gilbert");
        person1.setAge(25);
        System.out.println("Output value in main method " + person1.getName());
        System.out.println("Output value in main method " + person1.getAge());

        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        age = userAge;
    }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 70 - age;
        return years;
    }

    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old ");
    }
}
