package Inheritance_and_Polymorphism;

class SuperHero extends Person {
    private String alterEgo;

    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {

        SuperHero theManOfSteel = new SuperHero("John Henry Irons", "Steel");

        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());
        System.out.println("theManOfSteel.getSecretIdentity() = " + theManOfSteel.getSecretIdentity());
    }
}
