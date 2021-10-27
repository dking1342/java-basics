public class App {
    public static void main(String[] args) throws Exception {
        
        // example one
        Hero hero1 = new Hero("Batman",40,"stealth");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();

        // example two
        Hero hero2 = new Hero("Superman",50,"flying");
        System.out.println(hero2.toString());
        System.out.println();

        // example three
        Person person1 = new Person("Jack",30);
        System.out.println(person1.toString());
    }
}
