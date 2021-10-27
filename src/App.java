import package1.*;
import package2.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // cannot work because this is not in the same package
        // cannot work because nothing is being imported
        // C c = new C();
        // System.out.println(c.defaultMessage);

        A a = new A();
        // public message can be accessed because it is public
        System.out.println(a.publicMessage());

        Asub asub = new Asub();
        System.out.println(asub);
        
    }
}
