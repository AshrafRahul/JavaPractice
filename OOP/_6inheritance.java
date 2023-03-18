public class _6inheritance {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.name = "Ashraf";
        // p1.age = 22;
        Person p2 = new Person(23, "Ashraf");
        // p2.name = "Rahul";
        // p2.age = 23;

        // p1.walk();
        // p2.eat();
        // p2.walk(5);

        // System.out.println(Person.count);

        Developer d1 = new Developer(23, "Ashraf");
        d1.walk();
        d1.eat();
    }
}

class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }

    void eat(){
        System.out.println("Developer "+name+" is eating");
    }
}

class Person{
    String name;
    int age;

    static int count;

    // public Person(){
    //     count++;
    //     System.out.println("Creating an object");
    // }

    public Person(int age, String name){
        this.name = name;
        this.age = age;
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
    void doWork(){
        System.out.println("Person is working");
    }
}
