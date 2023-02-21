public class _3constructors {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ashraf";
        Person p2 = new Person();
        p2.name = "Rahul";

        p1.walk();
        p2.eat();
        p2.walk(5);
    }
}

class Person{
    String name;
    int age;

    public Person(){
        System.out.println("Creating an object");
    }

    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
}