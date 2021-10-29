import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] people = {
            new Person("Jack",Gender.MALE),
            new Person("Jill",Gender.FEMALE),
            new Person("Jon",Gender.MALE),
            new Person("Alice",Gender.FEMALE)            
        };

        // imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // declarative approach
        System.out.println("Declarative approach");
        List<Person> persons = new ArrayList(){{
            add(new Person("Joe",Gender.MALE));
            add(new Person("Jane",Gender.FEMALE));
            add(new Person("Jack",Gender.MALE));
        }};

        persons.stream()
            .filter(person -> Gender.FEMALE.equals(person.gender))
            .collect(Collectors.toList())
            // .forEach(person -> System.out.println(person));
            .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person{ name: " + name + ", gender: " + gender + " }";
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
