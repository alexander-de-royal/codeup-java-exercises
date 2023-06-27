package Inheritance_and_Polymorphism;

class Employee extends Person {
    private double salary;

    public Employee(String employeeName){
        super(employeeName);
    }

    public void doWork() {
        System.out.println("Work, work...");
    }

    // method overriding
    public void sayHello() {
        System.out.println("How can I help you?");
    }

    public String getName() {
        return this.name;
    }

    public String work() {
        return "Filling out TPS reports";
    }

//    public int getAge() {
//        // ERROR!
//        return this.age;
//    }

    public static void main(String[] args) {

        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);

        Person p = new Person("Jim");
        Employee e = new Employee("Jane");

        e.sayHello(); // prints "Hello from *name*"
        e.doWork(); // prints "Work, work..."
        p.sayHello();

//        p.doWork(); Does not work. Can't inherit from children


    }
}
