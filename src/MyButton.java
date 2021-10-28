import java.swing.JFrame;

public class MyButton extends JFrame {

    // JButton is a button that performs an action when clicked
    // working with JButton child class
    JButton button = new JButton();
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    button.setBounds(200,100,100,50);
    button.addActionListener(e -> System.out.println("clicked"));
    button.setText("Button"); // sets the text of the button
    button.setFocusable(false); // gets rid of box around the text
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans",Font.BOLD,24));
    button.setIconTextGap(-25);
    button.setForeground(Color.blue);
    button.setBackground(Color.red);
    button.setBorder(BorderFactory.createEtchedBorder());
    // button.setEnabled(false); // this will disable or enable the btn


    label.setText("label text");
    label.setBounds(0,0,100,50);
    label.setVisible(true);
    label.setVerticalAlignment(JLabel.TOP);
    label.setHorizontalAlignment(JLabel.CENTER);

    // JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.setVisible(true);
    frame.add(button);
    button.add(label);

    // @Override
    // public void actionPerformed(ActionEvent e){
    //     if(e.getSource() == button){
    //         System.out.println("clicked");
    //     }
    // }
       
}