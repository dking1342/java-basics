# Lesson 4

## Getting started
To make a project use the following:

```
shift + command + P
Java: Create Java Project
```

You will select a folder to house your project then VSCode will generate a project there.

The project will have a class that contains everything. The class is generally named the same as the file name such as App.java

Within the class you will have a main class that will be needed for Java to run this program. This is necessary and the file will not run unless it has it. The completed first classes look like this:

```
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Create a GUI interface for user inputs
First you need to import the JOptionPane class

```
import javax.swing.JOptionPane
```

Create a variable for the user input then an message box that will display:

```
String name = JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null,"Hello " + name);
```

You can do this for other data types but you will need to add a wrapper around the variable since the input is a string.

```
int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
JOptionPabe.showMessageDialog(null,"You are " + age + " years old");
```

When you run this program then a GUI screen will appear to require input from the user based on what was programmed.

