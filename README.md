# Lesson 29

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

## Access modifiers
Access modifiers are for classes and methods. It tells what is accessible within the class or method and if the user or child classes have access. The three access modifiers are public, protected and private. Public is where it can be accessed. Private is where it cannot be accessed. Protected is where there are limitations to what can be accessed. For more on access modifiers in Java <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html">click here</a>