public class MyPanel {

        // JPanel is a GUI component that functions as a container to hold other components
        // working with JLabels
        JLabel redLabel = new JLabel();
        redLabel.setText("hello i am red");
        // redLabel.setBounds(0,0,250,250);

        JLabel blueLabel = new JLabel();
        blueLabel.setText("hello i am blue");
        // blueLabel.setBounds(250,0,250,250);

        JLabel greenLabel = new JLabel();
        greenLabel.setText("hello i am green");
        // greenLabel.setBounds(0,250,500,500);


        // working with JPanels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        // redPanel.setLayout(new BorderLayout());
        // redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        // bluePanel.setLayout(new BorderLayout());
        // bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,500);
        // greenPanel.setLayout(new BorderLayout());
        // greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
        redPanel.add(redLabel);
        frame.add(bluePanel);
        bluePanel.add(blueLabel);
        frame.add(greenPanel);
        greenPanel.add(greenLabel);    
}