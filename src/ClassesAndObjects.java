/* public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        // person1.name = "Dara";
        person1.setName("David",31);
        // person1.age = 31;
        person1.speak();
        person1.ageRange();
        person1.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println(person1.name + ", you have " + year1 + " years to retirement");


        Person person2 = new Person();
        String s1 = "Dara";
        person2.setName("Dara",48);

        person2.retired = false;
        person2.speak();
        person2.ageRange();
        person2.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println(person2.name + ", you have " + year2 + " years to retirement");


        Person person3 = new Person();
        person3.name = "Gertrude";
        person3.age = 89;
        person3.retired = false;
        person3.speak();
        person3.ageRange();
        person3.calculateYearsToRetirement();
        int year3 = person3.calculateYearsToRetirement();
        System.out.println(person3.name + ", you have " + year3 + " years to retirement");

        // these lines are no longer needed due to using the method below
        // System.out.println("\nI am person1 and my name is " + person1.name + " and I am " + person1.age + " years old");
        // System.out.println("I am person2 and my name is " + person2.name + " and I am " + person2.age + " years old");
    }
}

class Person {
    String name;
    int age;
    boolean retired;

    void setName(String userName, int userAge){
        name = userName;
        age = userAge;
    }

    void speak() {
        System.out.println("\nMy name is " + name + " and I am " + age + " years old.");
    }

    void ageRange(){
        if(age>65){
            System.out.println("Hello, " + name + ", you are way old");
        }
        else System.out.println("Hello, " + name + ", you are a young pup");
    }

    int calculateYearsToRetirement(){
        int years = 70 - age;
        return years;
        }
}
*/