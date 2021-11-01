import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        
        // without supplier
        System.out.println("without supplier");
        System.out.println(getConnectionUrl());

        // with supplier
        System.out.println("with a supplier");
        System.out.println(getConnectionUrlSupplier.get());
    }

    // without a supplier
    static String getConnectionUrl() {
        return "http://localhost:5432/users";
    }

    // with a supplier
    static Supplier<String> getConnectionUrlSupplier = () -> 
        "http://localhost:8080/vuejs";
}