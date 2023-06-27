//import java.util.Arrays;

import java.util.Arrays;

//import java.util.Arrays;
//import java.util.List;
public class ArraysExercises {

    private static PersonE[] addPerson(PersonE[] people, PersonE person){
        PersonE[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length-1] = person; //newArray[people.length] = person;
        return newArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers);

        PersonE[] people = new PersonE[3];
        people[0] = new PersonE("Jim");
        people[1] = new PersonE("Tim");
        people[2] = new PersonE("Vim");

        for(PersonE person: people){
            System.out.println(person.getName());
        }

        people = addPerson(people, new PersonE("Penelope"));
        for(PersonE person: people){
            System.out.println(person.getName());
        }
    }
//    public String name;
//    public ArraysExercises(String name){
//        this.name = name;
//    }
//    public static Person[] addPerson(Person[] people, Person newPerson){
//        Person[] newArray = Arrays.copyOf(people, people.length + 1);
//        newArray[newArray.length - 1] = newPerson;
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));
//
//        Person[] people = new Person[3];
//        people[0] = new Person("Apple");
//        people[1] = new Person("Pine");
//        people[2] = new Person("Roseberry");
//
//        for(Person person:people){
//            System.out.println(person.name);
//        }
//
//        Person newPerson = new Person("Robert");
//        people = addPerson(people, newPerson);
//
//        for(Person person:people){
//            System.out.println(person.name);
//        }
//
//    }

}
