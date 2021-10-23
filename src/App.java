public class App {
    public static void main(String[] args) throws Exception {
        
        greeting();

        String name = "kavooce";
        int age = 18;
        hello(name,age); // needs the parameter/s for this method to work properly

        // using a method with a return value 
        int x = 3;
        int y = 5;
        System.out.println(sum(x,y));
    }

    // method without a parameter
    static void greeting(){
        System.out.println("greetings");
    }

    // method with a parameter
    static void hello(String name, int age){
        System.out.println("hello " + name + " you are " + age + " years old!");
    }

    // return value is defined here
    static int sum(int x, int y){
        return x + y;
    }

}
