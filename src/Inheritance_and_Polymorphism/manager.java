package Inheritance_and_Polymorphism;

public class Manager extends Employee {

    public Manager(String name){
        super(name);
    }

    public String work() {
        return "Managing employees";
    }
}
