import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("secret_message.txt");
        File file2 = new File("/Users/kavooce/Coding/Practice/Java/lesson-36/lib/secret_message.txt");

        if(file.exists()){
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete(); // this will delete the file, refresh afterwards
        } else {
            System.out.println("That file does not exists!");
        }

        if(file2.exists()){
            System.out.println("It is alive!");
        } else {
            System.out.println("It is dead!");
        }
    }
}
