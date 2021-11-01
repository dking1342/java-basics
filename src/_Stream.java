import java.util.ArrayList;
import java.util.List;
// import java.util.stream;
import java.util.stream.Collectors;
import java.util.*;

public class _Stream {
    public static void main(String[] args) {

        // list of people using the Person class
        List<Person> persons = new ArrayList(){{
            add(new Person("Joe",Gender.MALE));
            add(new Person("Jane",Gender.FEMALE));
            add(new Person("Jack",Gender.MALE));
            add(new Person("Julie",Gender.FEMALE));
            add(new Person("Jonah",Gender.PREFER_NOT_TO_SAY));
        }};

        // using a stream and chaining methods
        // persons.stream()
        //     .map(person -> person.gender)
        //     .collect(Collectors.toSet())
        //     .forEach(System.out::println);

        // using different methods
        // persons.stream()
        //     .map(person -> person.gender)
        //     .mapToInt(str -> str.length())
        //     .forEach(System.out::println);

        // creating variable to hold the stream
        boolean isFemaleAllMatch = persons.stream()
            .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isFemaleAllMatch);

        // creating variable to hold the stream
        boolean isFemaleSomeMatch = persons.stream()
            .anyMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isFemaleSomeMatch);

        // creating variable to hold stream
        boolean isFemaleNoMatch = persons.stream()
            .noneMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isFemaleNoMatch);
        
        // stream has many methods that can be chained together
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
        FEMALE,
        PREFER_NOT_TO_SAY
    }    
}