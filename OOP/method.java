package JavaPractice.OOP;

public class method {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ashraf";
        p1.age = 22;
        p1.eat();

        Person p2 = new Person();
        p2.name = "Rahul";
        p2.age = 23;
        p2.walk();
    }
}

class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
}