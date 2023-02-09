package Java_Practice.OOP;

public class class_object {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ashraf";
        p1.age = 22;

        Person p2 = new Person();
        p2.name = "Rahul";
        p2.age = 23;

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
    }
}

class Person{
    String name;
    int age;
}
