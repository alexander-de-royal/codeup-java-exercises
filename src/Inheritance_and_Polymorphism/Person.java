package Inheritance_and_Polymorphism;

public class Person {
    public String name;
    //    private String name;
//    protected String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public String getName() {
        return name;
    }

//    public int getAge() {
//        // ERROR!
//        return this.age;
//    }

//    public static void main(String[] args) {
//
//        SuperHero theManOfSteel = new SuperHero("John Henry Irons", "Steel");
//
//        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());
//        System.out.println("theManOfSteel.getSecretIdentity() = " + theManOfSteel.getSecretIdentity());
//
//    }
}
