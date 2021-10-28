public class MyLabel {

        // working with JFrame labels        
        // set image
        // ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        
        // label stuff
        JLabel label = new JLabel();
        label.setText("This is the label text"); // sets text of label
        // label.setIcon(image); // sets the image
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.white); // sets the color
        label.setFont(new Font("Arial",Font.PLAIN,24)); // sets the font
        label.setIconTextGap(100); // sets the gap between image and text
        label.setBackground(Color.red); // sets the bg color
        label.setOpaque(true); // display bg color
        label.setBorder(border); // sets the border
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal alignment
        // label.setBounds(0,0,250,250); // sets the x, y and width, height of the label

        
        // JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        frame.setVisible(true);
        // frame.setLayout(null);
        // frame.getContentPane().setBackground(Color.black);
        frame.add(label);
        frame.pack(); // must pack last otherwise nothing will show up

}