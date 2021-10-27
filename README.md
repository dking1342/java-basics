# Lesson 28

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

## Abstract keyword
The abstract keyword are abstract classes that cannot be instantiated, but they can have a subclass. The abstract methods are declared without an implementation. For more on the abstract keyword in Java <a href="https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html">click here</a>