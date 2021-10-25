# Lesson 16

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

## printf method
The printf method is an optional method to control, format and display test to the console. It takes two arguments. The first being the format string or what you would like the output message to be formatted with. The second parameter is the object, variable, value, etc. It uses a % as a flag. For more about the printf method in Java <a href="https://docs.oracle.com/javase/tutorial/java/data/numberformat.html">click here</a>