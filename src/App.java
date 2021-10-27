import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nviolets are blue");
            writer.append("\n By Kavooce");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
