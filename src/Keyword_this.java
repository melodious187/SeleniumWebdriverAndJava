public class Keyword_this {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setName("Alex");
        human1.setAge(25);
        human1.getInfo();

    }
}

class Human{
    String name;
    int age;

    // setter for name
    public void setName(String name){
        this.name = name;
    }

    // getter for name
    public String getName(){
        return name;
    }

    // setter for age
    public void setAge(int age){
        this.age = age;
    }

    // getter for age
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " : " + age);
    }
}