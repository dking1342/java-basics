public class App {
    public static void main(String[] args) throws Exception {
        
        int x = add(1,2,3,4); // data type of variable has to match parameters
        double y = add(1.0,2.0,3.0,4.0);
        System.out.println(x);
        System.out.println(y);
    }

    static int add(int a, int b){
        System.out.println("This is overload method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overload method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is overload method #4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overload method #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overload method #6");
        return a + b + c + d;
    }
}
