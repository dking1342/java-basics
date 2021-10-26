# Lesson 26

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

## Method Overriding
Method overriding is declaring a method in the sub class which is already present in the parent class. It is done so that a child class can give its own implementation. For more on method overrding in Java <a href="https://docs.oracle.com/javase/tutorial/java/IandI/override.html">click here</a>