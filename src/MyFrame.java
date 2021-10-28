import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame title here!"); // sets the title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the program
        this.setSize(400,400); // sets width and height
        this.setResizable(false); // prevents size change
        this.setVisible(true); // makes the frame visible
        this.getContentPane().setBackground(Color.green); // changes bg color
        // this.getContentPane().setBackground(new Color(0,0,0)); // changes bg color
        // this.getContentPane().setBackground(new Color(0xff0000)); // changes bg color

        // sets the icon
        // ImageIcon image = new ImageIcon("logo.png");
        // this.setIconImage(image.getImage());

    }

    public static void main(String[] args) {
        
    }
}