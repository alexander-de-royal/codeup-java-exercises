class Person {

    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, from %s.%n", name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        System.out.println("person1.getName() = " + person1.getName());
        person1.setName("Bob Smith");
        System.out.println("person1.getName() = " + person1.getName());
        person1.sayHello();
    }

}
