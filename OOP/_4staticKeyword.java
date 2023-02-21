public class _4staticKeyword {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ashraf";
        p1.age = 22;
        Person p2 = new Person(23, "Ashraf");
        // p2.name = "Rahul";
        // p2.age = 23;

        p1.walk();
        p2.eat();
        p2.walk(5);

        System.out.println(Person.count);
    }
}

class Person{
    String name;
    int age;

    static int count;

    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    public Person(int newAge, String newName){
        name = newName;
        age = newAge;
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