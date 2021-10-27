public class Hero extends Person{

    String power;

    Hero(String name, int age, String power){

        // technically this is correct if all are parameters
        // this.name = name;
        // this.age = age;
        // this.power = power;

        // using the super keyword
        super(name, age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + " and has the power of " + this.power;
    }
}