import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Person> persons = new ArrayList(){{
            add(new Person("Joe",Gender.MALE));
            add(new Person("Jane",Gender.FEMALE));
            add(new Person("Jack",Gender.MALE));
            add(new Person("Julie",Gender.FEMALE));
        }};

        // predicate function
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        persons.stream()
            // now the predicate function can be used inside this stream
            .filter(personPredicate)
            .collect(Collectors.toList())
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
