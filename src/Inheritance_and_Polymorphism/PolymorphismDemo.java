package Inheritance_and_Polymorphism;

public class PolymorphismDemo {

    public static void doWork(Employee e) {
        System.out.println(e.work());
    }

    public static void main(String[] args) {
        Employee one = new Employee("Jim");
        Employee two = new Manager("Jane");

        doWork(one); // "Filling out TPS reports"
        doWork(two); // "Managing employees"


    }

}
